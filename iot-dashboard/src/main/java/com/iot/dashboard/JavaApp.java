package com.iot.dashboard;

import java.util.List;
import java.util.Scanner;

public class JavaApp {
    private final CustomerDAO customerDAO = new CustomerDAO();
    private final GadgetDAO gadgetDAO = new GadgetDAO();
    private final DeviceRegistrationAPI regApi = new DeviceRegistrationAPI(gadgetDAO);
    private final UpdateGadgetStatus statusUpdater = new UpdateGadgetStatus(gadgetDAO, new TelemetryService());

    private Long loggedInCustomerId = null;
    private String loggedInCustomerName = null;

    public static void main(String[] args) {
        JavaApp app = new JavaApp();
        app.start();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== IoT Smart Home Dashboard ===");
            System.out.println("1. Customer Register");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            String opt = sc.nextLine().trim();
            switch (opt) {
                case "1": register(sc); break;
                case "2": login(sc); break;
                case "3": exitApp(); return;
                default: System.out.println("Invalid option"); break;
            }
        }
    }

    private void register(Scanner sc) {
        System.out.print("Enter full name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter email: ");
        String email = sc.nextLine().trim();
        if (customerDAO.findByEmail(email) != null) {
            System.out.println("This email is already registered.");
            return;
        }
        System.out.print("Choose password: ");
        String p1 = sc.nextLine();
        System.out.print("Confirm password: ");
        String p2 = sc.nextLine();
        if (!p1.equals(p2)) {
            System.out.println("Passwords do not match.");
            return;
        }
        String hash = AuthService.hashPassword(p1);
        Customer c = new Customer(null, name, email, hash);
        boolean ok = customerDAO.create(c);
        if (ok) {
            System.out.println("Thank you — account created successfully. Your id: " + c.getId());
        } else {
            System.out.println("Failed to create account.");
        }
    }

    private void login(Scanner sc) {
        System.out.print("Email: ");
        String email = sc.nextLine().trim();
        Customer c = customerDAO.findByEmail(email);
        if (c == null) {
            System.out.println("Invalid email.");
            return;
        }
        System.out.print("Password: ");
        String pw = sc.nextLine();
        if (!AuthService.verifyPassword(pw, c.getPasswordHash())) {
            System.out.println("Invalid password.");
            return;
        }
        loggedInCustomerId = c.getId();
        loggedInCustomerName = c.getName();
        System.out.println("Login successful. Hello " + loggedInCustomerName);


        while (true) {
            System.out.println("\n=== IoT Smart Home ===");
            System.out.println("1. Add Gadget");
            System.out.println("2. View Gadgets");
            System.out.println("3. Change Gadget Status");
            System.out.println("4. Remove Gadget");
            System.out.println("5. Logout");
            System.out.print("Choose option: ");
            String opt = sc.nextLine().trim();
            switch (opt) {
                case "1": controlGadgets(sc); break;
                case "2": viewGadgets(sc); break;
                case "3": changeGadgetStatus(sc); break;
                case "4": removeGadget(sc); break;
                case "5": exitApp(); return;
                default: System.out.println("Invalid option"); break;
            }
        }
    }

    private void controlGadgets(Scanner sc) {
        if (!checkLoggedIn()) return;
        System.out.print("Enter deviceId (eg: tv-1): ");
        String deviceId = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter type (TV/AC/Fan/Light/RoboVac): ");
        String type = sc.nextLine().trim();
        System.out.print("Enter model: ");
        String model = sc.nextLine().trim();
        System.out.print("Enter room: ");
        String room = sc.nextLine().trim();

        Gadget g = new Gadget(null, deviceId, loggedInCustomerId, type, model, room, false);
        boolean ok = regApi.registerDevice(loggedInCustomerId, g);
        if (!ok) {
            System.out.println("Failed to create gadget (maybe deviceId exists).");
        } else {
            System.out.println("Gadget created successfully: " + deviceId);
        }
    }

    private void viewGadgets(Scanner sc) {
        if (!checkLoggedIn()) return;
        List<Gadget> list = gadgetDAO.findByOwner(loggedInCustomerId);
        if (list.isEmpty()) {
            System.out.println("No gadgets found for your account.");
            return;
        }
        System.out.println("Your gadgets:");
        for (Gadget g : list) {
            System.out.printf("- %5s | %5s | %10s | %10s | Status: %4s\n",
                    g.getDeviceId(), g.getType(), g.getModel(), g.getRoom(), g.isStatus() ? "ON" : "OFF");
        }
    }

    private void changeGadgetStatus(Scanner sc) {
        if (!checkLoggedIn()) return;
        System.out.print("Enter deviceId to change status: ");
        String deviceId = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter new status (on/off): ");
        String s = sc.nextLine().trim().toLowerCase();
        boolean on = s.equals("on");
        boolean ok = statusUpdater.applyStatus(deviceId, loggedInCustomerId, on);
        if (ok) {
            System.out.println((on ? "switched on" : "switched off") + " Successful");
        }
    }

    private boolean checkLoggedIn() {
        if (loggedInCustomerId == null) {
            System.out.println("Please login first.");
            return false;
        }
        return true;
    }

    private void removeGadget(Scanner sc) {
        if (!checkLoggedIn()) return;

        System.out.print("Enter deviceId to remove: ");
        String deviceId = sc.nextLine().trim().toLowerCase();

        boolean deleted = gadgetDAO.deleteByDeviceId(deviceId, loggedInCustomerId);
        if (deleted) {
            System.out.println("Gadget " + deviceId + " removed successfully.");

        } else {
            System.out.println("Failed to remove gadget. Check deviceId/ownership.");
        }
    }

    private void exitApp() {
        System.out.println("Goodbye.");
    }
}
package com.iot.dashboard;

public class DeviceRegistrationAPI {
    private final GadgetDAO gadgetDAO;

    public DeviceRegistrationAPI(GadgetDAO gadgetDAO) {
        this.gadgetDAO = gadgetDAO;
    }

    public boolean registerDevice(long ownerId, Gadget gadget) {
        if (ownerId <= 0) {
            System.out.println("Invalid owner (not logged in).");
            return false;
        }
        if (gadget.getDeviceId() == null || gadget.getDeviceId().isEmpty()) {
            System.out.println("DeviceId cannot be empty.");
            return false;
        }
        if (gadgetDAO.findByOwner(ownerId).stream()
                .anyMatch(g -> g.getDeviceId().equalsIgnoreCase(gadget.getDeviceId()))) {
            System.out.println("Device with this ID already exists for your account.");
            return false;
        }
        boolean ok = gadgetDAO.create(gadget, ownerId);
        if (ok) {
            System.out.println("Device registered: " + gadget.getDeviceId());
            new TelemetryService().writeTelemetry(gadget.getDeviceId(), "register", "REGISTERED");
        } else {
            System.out.println("Failed to register device (DB error).");
        }
        return ok;
    }
}

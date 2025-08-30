package Singelton_DManger;

import java.util.Scanner;

public class TestSingleton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DManager manager = DManager.getInstance();

        System.out.println("Enter items (type 'Done' to stop):");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Done")) {
                break;
            }
            manager.addItem(input);
        }

        System.out.println("Enter item to remove:");
        String removeItem = sc.nextLine();
        manager.removeItem(removeItem);

        System.out.println("Final items in Manager: " + manager.getList());

        sc.close();
    }
}
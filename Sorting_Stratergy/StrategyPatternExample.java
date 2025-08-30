package Sorting_Stratergy;

import java.util.Scanner;

public class StrategyPatternExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortingStretagy context = new SortingStretagy();

        // Step 1: Take input from user
        System.out.println("Enter items (type 'Done' to stop):");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Done")) {
                break;
            }
            context.addItem(input);
        }

        // Step 2: Choose sorting strategy
        System.out.println("Choose sorting strategy:");
        System.out.println("1 - Alphabetical");
        System.out.println("2 - Lengthwise");
        int choice = sc.nextInt();

        if (choice == 1) {
            context.setStrategy(new AlphabeticalSort());
        } else if (choice == 2) {
            context.setStrategy(new LengthSort());
        } else {
            System.out.println("Invalid choice. Defaulting to Alphabetical.");
            context.setStrategy(new AlphabeticalSort());
        }

        // Step 3: Perform sorting
        context.performSort();
        System.out.println("Sorted List: " + context.getList());

        sc.close();
    }
}
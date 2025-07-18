import java.util.Scanner;

public class Day18_Task003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        String numStr = Integer.toString(java.lang.Math.abs(number));
        System.out.println("It's a " + numStr.length() + " digit number");
    }
}
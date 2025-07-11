import java.util.Scanner;

public class Day16_Fibanociseries_of_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            System.out.println("Fibonacci series up to " + n + " terms:");
            printFibonacci(n);
        }
    }

    public static void printFibonacci(int n) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}

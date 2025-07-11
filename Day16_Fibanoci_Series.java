import java.util.Scanner;

public class Day16_Fibanoci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long factorial = calculateFactorial(num);
            System.out.println("Factorial of " + num + " = " + factorial);
        }
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

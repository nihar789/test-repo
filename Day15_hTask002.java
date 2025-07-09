public class Day15_hTask002 {
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Sum of digits: " + sumOfDigits(num));
    }
}

public class Day15_hTask004 {
        public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        decimalToBinary(n, binary);
        return binary.toString();
    }

        private static void decimalToBinary(int n, StringBuilder binary) {
        if (n > 1) {
            decimalToBinary(n / 2, binary);
        }
        binary.append(n % 2);
    }

        public static void main(String[] args) {
        int decimal = 18;
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + decimalToBinary(decimal));
    }
}

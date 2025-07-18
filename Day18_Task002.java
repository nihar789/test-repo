import java.util.Scanner;

public class Day18_Task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        String numStr = Integer.toString(java.lang.Math.abs(number));
        String[] placeValues = {"Units", "Tens", "Hundreds", "Thousands", "Ten Thousands", "Lakhs", "Ten Lakhs", "Crores"};

        for (int i = 0; i < numStr.length(); i++) {
            String placeValue = getPlaceValue(numStr.length() - i - 1, placeValues);
            System.out.println(placeValue + " digit is: " + numStr.charAt(i));
        }
    }

    private static String getPlaceValue(int index, String[] placeValues) {
        if (index < placeValues.length) {
            return placeValues[index];
        } else {
            return (int) java.lang.Math.pow(10, index) + "";
        }
    }
}

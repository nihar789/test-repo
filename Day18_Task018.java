import java.util.*;

public class Day18_Task018 {
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        int pos = 1;
        while (max / pos > 0) {
            countSort(arr, pos);
            pos *= 10;
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void countSort(int[] arr, int pos) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / pos) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / pos) % 10] - 1] = arr[i];
            count[(arr[i] / pos) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array:");
        printArray(arr);
        radixSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}

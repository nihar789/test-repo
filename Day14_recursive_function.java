public class Day14_recursive_function {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = recursiveSearch(array, target, 0);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int recursiveSearch(int[] array, int target, int index) {
        if (index >= array.length) {
            return -1;
        }
        if (array[index] == target) {
            return index;
        }
        return recursiveSearch(array, target, index + 1);
    }
}

package Arrays;

public class TASK014 {

    public static void main(String[] args) {
        // Character array
        char[] arr = { 'a', 'e', 'i', 'o', 'u' };
        System.out.println(java.util.Arrays.toString(arr));

        // String array
        String[] names = { "Meena", "Tina", "Veena", "Heena" };

        // Accessing individual elements
        System.out.println(names[0]); // Meena

        // Assigning a value to index 1
        names[1] = "Reena";
        System.out.println(names[1]);

        System.out.println(names.length);

        System.out.println(names[4]);
    }
}
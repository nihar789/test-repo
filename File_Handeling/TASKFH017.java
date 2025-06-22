import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TASKFH017 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(44);
        numbers.add(12);
        numbers.add(66);
        numbers.add(44);
        numbers.add(77);
        numbers.add(12);
        numbers.add(66);

        // Display the original list
        System.out.println("Original list: " + numbers);

        // Remove duplicates from the list
        List<Integer> removeDups = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Display the list after removing duplicates
        System.out.println("List after removing duplicates: " + removeDups);
    }
}

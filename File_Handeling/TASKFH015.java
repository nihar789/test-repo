package File_Handeling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TASKFH015 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Numbers: " + numbers);
        System.out.println("Squares: " + squares);
    }
}
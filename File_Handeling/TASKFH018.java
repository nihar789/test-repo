package File_Handeling;
import java.util.stream.Stream;

public class TASKFH018 {
    public static void main(String[] args) {
        // Create a stream of numbers from 1 to 20
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);

        // Display the first 10 numbers
        nums.limit(10)
                .forEach(System.out::println);
    }
}

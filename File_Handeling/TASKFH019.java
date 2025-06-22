package File_Handeling;
import java.util.stream.Stream;

public class TASKFH019 {
    public static void main(String[] args) {
        // Create a stream of numbers from 1 to 20
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);

        // Skip the first 15 numbers
        Stream<Integer> skipNums = nums.skip(15);

        // Print the remaining numbers
        skipNums.forEach(System.out::println);
    }
}

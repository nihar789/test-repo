import java.util.Objects;
import java.util.Stack;

public class Day14_Task6 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        Stack name = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        int count=1;
        for (Object o : stack) {

            if (o.equals(10)) {
                System.out.println("using for-each loop, the position is : " + count);

            }

            count++;

        }
    }
}
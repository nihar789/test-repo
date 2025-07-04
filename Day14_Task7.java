import java.util.Stack;

public class Day14_Task7 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        Stack name = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
    }
}

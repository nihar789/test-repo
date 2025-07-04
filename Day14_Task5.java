import java.util.Stack;

public class Day14_Task5 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stacks: "+stack);
        System.out.println("Stacks: "+stack.pop());
        System.out.println("Stack: "+stack);

        System.out.println("Stacks: "+stack.pop());
        System.out.println("Stack: "+stack);

        System.out.println("Stacks: "+stack.pop());
        System.out.println("Stack: "+stack);
    }
}

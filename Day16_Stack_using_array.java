public class Day16_Stack_using_array {
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    // Push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push element " + element);
            return;
        }
        array[++top] = element;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element");
            return -1; // or throw an exception
        }
        return array[top--];
    }

    // Get the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return array[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Print the stack elements
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Day16_Stack_using_array stack = new Day16_Stack_using_array(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack(); // Output: Stack elements: 1 2 3
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 3
        stack.printStack(); // Output: Stack elements: 1 2
        System.out.println("Top element: " + stack.peek()); // Output: Top element: 2
    }
}

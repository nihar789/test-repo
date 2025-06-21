public class TASK042 {
    // Constant
    public static final double PI = 3.14159;

    // Final variable
    private final int id;

    public TASK042(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        TASK042 obj = new TASK042(10);
        System.out.println("Constant PI: " + TASK042.PI);
        System.out.println("Final variable id: " + obj.id);

        // Trying to reassign a value to a final variable will result in a compile-time error
        // obj.id = 20; // Uncommenting this line will cause a compile-time error
    }
}

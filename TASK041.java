import java.io.*;

// Interface Declared
interface testInterface {
    // public, static and final
    final int tax = 10;

    // public and abstract
    void display();
}

// Class implementing interface
class TestClass implements testInterface {
    // Implementing the capabilities of Interface
    @Override
    public void display() {
        System.out.println("Myclass");
    }
}

// Driver Code
public class TASK041 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(testInterface.tax); // Accessing tax using interface name
    }
}

package BridgeMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Method Design Pattern - Structural DP!");
        ExcalidrawAPI obj1 = new DrawingFrame();
        ExcalidrawAPI obj2 = new DrawingPicture();

        Shape square1 = new Square(obj1, 5);
        Shape square2 = new Square(obj2, 5);

        square1.draw();
        square2.draw();
    }
}



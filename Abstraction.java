//abstraction classes
abstract class Shape{
    //abstract method (no implementation)
    public abstract void draw();

    //concrete method
    public void displayarea(){
        System.out.println("Area: "+calculateArea());
    }

    //abstact method
    protected abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    protected double calculateArea(){
        return radius*radius;
    }
}

//sub class
class Rectangle_1 extends Shape{
    private double length;
    private double width;

    public Rectangle_1(double length, double width){
        this.length = length;
        this.width=width;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }

    @Override
    protected double calculateArea(){
        return length*width;
    }
}

public class Abstraction{
    public static void main(String[] args) {
        //creating an instance
        Circle circle = new Circle(5);
        Rectangle_1 rectangle = new Rectangle_1(4,6);

        //using abstract class reference
        Shape shape = circle;

        //calling a abstract methods
        shape.draw();
    }
}

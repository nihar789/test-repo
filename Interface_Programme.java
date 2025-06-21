interface Shape2{
    double area();
    void display();
}


//implementation the shape2 interface in a class
class Circle2 implements Shape2{
    double radius;

    //Constructor
    public Circle2 (double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius*radius;
    }
    @Override
    public void display(){
        System.out.println("This is a Circle.");
    }


}
public class Interface_Programme {
    //creating an instance
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5);
        System.out.println("Area of circle: "+circle);
        circle.display();
    }

}

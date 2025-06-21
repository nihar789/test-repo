//super class
class shape{
    void draw(){
        System.out.println("Drawing a shape.");
    }
}
class circle extends shape{
    void drawcircle(){
        System.out.println("Drawing a circle.");
    }
}
class square extends shape{
    void drawsquare(){
        System.out.println("Drawing a square.");
    }
}

public class hirarical_inheritance {
    public static void main(String[] args) {
        //creating anf object
        square myobj = new square();
        myobj.drawsquare();//child class own methord
        myobj.draw();//inherited from superclass
    }
}
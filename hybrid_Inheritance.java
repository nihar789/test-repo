import java.util.Spliterator;

interface Flyer{
    void fly();
}

class Bird{
    void chirp(){
        System.out.println("Bird Chirps");
    }
}

class sparrow extends Bird implements Flyer{
    @Override
    public void fly(){
        System.out.println("Sparrow Flys.");
    }
}

public class hybrid_Inheritance {
    public static void main(String[] args) {
        //creating a local obj or instance
        sparrow myobj = new sparrow();
        myobj.fly();//interface and child class method
        myobj.chirp();//inherited super class method
    }
}

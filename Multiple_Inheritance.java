interface Walkable{
    void walk();
}

interface Swimmable{
    void swim();
}

class Amphibian implements Walkable, Swimmable{
    @Override
    public void walk(){
        System.out.println("Amphibian is walking");
    }
    @Override
    public void swim(){
        System.out.println("Amphibian is swimming");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Amphibian myobj = new Amphibian();
        myobj.walk();
        myobj.swim();
    }

}

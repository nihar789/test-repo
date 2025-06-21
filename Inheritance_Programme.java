class Animal{
    void eat(){
        System.out.println("This animal eats food.");
    }
    void sleep(){
        System.out.println("THis animal is sleeping.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}

public class Inheritance_Programme {
    public static void main(String[] args) {
        Animal myobj = new Animal();

        myobj.eat();

        Dog myobj1 = new Dog();
        myobj1.bark();
        myobj1.sleep();
    }
}

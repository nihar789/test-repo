class Animal1{
    void eat(){
        System.out.println("This animal eats food.");
    }
}
class Mammal1 extends Animal1{
    void giveBirth(){
        System.out.println("Mammals give Birth.");
    }
}

class Dog1 extends Mammal1{
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args) {
        Dog1 myobj = new Dog1();

        myobj.bark();
        myobj.eat();
        myobj.giveBirth();
    }
}

package PrototypeDesignPattern;

// Client code
public class Prototype_Design {
    public static void main(String[] args) {
        Colors BlackPrototypeObj = new BlackConcretePrototype("Black Color");
        Colors WhitePrototypeObj = new WhiteConcretePrototype("White Color");
        System.out.println(BlackPrototypeObj.getName());
        System.out.println(WhitePrototypeObj.getName());

        Colors clonedBlackObj = BlackPrototypeObj.clone();
        Colors clonedWhiteObj = WhitePrototypeObj.clone();

        clonedBlackObj.setName("Dark Color");
        clonedWhiteObj.setName("Light Color");

        System.out.println("Black color is " + clonedBlackObj.getName());
        System.out.println("White color is " + clonedWhiteObj.getName());
    }
}

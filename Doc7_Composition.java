
class Wheel {
    public Wheel() {
        System.out.println("Wheel created");
    }
}

class Carcom {
    private Wheel[] wheels; // Composition

    public Carcom() {
        this.wheels = new Wheel[] {new Wheel(), new Wheel(), new Wheel(), new Wheel()};
        // Wheels are created and owned by Car
    }
}

public class Doc7_Composition {
    public static void main(String[] args) {
        Carcom myCar = new Carcom();
        // All wheels created with the car
    }
}

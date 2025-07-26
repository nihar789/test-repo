abstract class BirdsthatFly {
    abstract void fly();
}

abstract class BirdsthatDontFly {
    abstract void Speciality();
}

class Eagle extends BirdsthatFly {
    @Override
    public void fly() {
        System.out.println("Eagles fly");
    }
}

class Ostrich extends BirdsthatDontFly {
    @Override
    public void Speciality() {
        System.out.println("It lays big egg");
    }
}

public class Day21_Task2 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();

        Ostrich ostrich = new Ostrich();
        ostrich.Speciality();
    }
}

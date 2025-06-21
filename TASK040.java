// Working of Abstraction in Java
abstract class Gadgets {
    public abstract void turnOn();
    public abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class ACRemote extends Gadgets {
    @Override
    public void turnOn() {
        System.out.println("AC is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

class FanRemote extends Gadgets {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class CoolerRemote extends Gadgets {
    @Override
    public void turnOn() {
        System.out.println("Cooler is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

// Main class to demonstrate abstraction
public class TASK040 {
    public static void main(String[] args) {
        Gadgets tvRemote = new TVRemote();
        tvRemote.turnOn();
        tvRemote.turnOff();

        Gadgets acRemote = new ACRemote();
        acRemote.turnOn();
        acRemote.turnOff();

        Gadgets fanRemote = new FanRemote();
        fanRemote.turnOn();
        fanRemote.turnOff();

        Gadgets coolerRemote = new CoolerRemote();
        coolerRemote.turnOn();
        coolerRemote.turnOff();
    }
}

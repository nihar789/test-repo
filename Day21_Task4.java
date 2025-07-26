interface ICalcArea {
    void calcArea();
    void calcPerimeter();
}

interface ICalcVolume {
    void calcVolume();
}

class Circle implements ICalcArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating circle area");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Calculating circle perimeter");
    }
}

class Sphere implements ICalcArea, ICalcVolume {
    @Override
    public void calcArea() {
        System.out.println("Calculating sphere surface area");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Calculating sphere perimeter (not applicable)");
    }

    @Override
    public void calcVolume() {
        System.out.println("Calculating sphere volume");
    }
}

public class Day21_Task4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calcArea();
        circle.calcPerimeter();

        Sphere sphere = new Sphere();
        sphere.calcArea();
        sphere.calcPerimeter();
        sphere.calcVolume();
    }
}

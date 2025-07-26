//class Engine {
//    func start() {
//        print("Engine starting")
//    }
//}
//class Car {let engine: Engine
//    init(engine: Engine) {self.engine = engine
//    }
//    func drive() {
//        engine.start()
//        print("Car is driving")
//    }
//}
//// Usage
//let engine = Engine()
//let myCar = Car(engine: engine)
//        myCar.drive()


    class Engine7 {
    public void start() {
        //func start() {

        System.out.println("Engine starting");

    }
}

class Car7 {
    public void drive() {
        Engine7 engine = new Engine7(); // Dependency
        engine.start();
        System.out.println("Car is driving");
    }
}

public class Doc7_Dependency {
    public static void main(String[] args) {
        Car7 myCar = new Car7();
        myCar.drive();
    }
}

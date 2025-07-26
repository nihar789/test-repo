class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class CarAgg {
    private Driver driver;

    public CarAgg(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}

public class Doc7_aggregation {
    public static void main(String[] args) {
        Driver driver = new Driver("John");
        CarAgg myCar = new CarAgg(driver);
    }
}

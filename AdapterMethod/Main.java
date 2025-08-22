package AdapterMethod;

// Client code
public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Method Design Pattern");

        powerSocketAdapter adapter = new powerSocketAdapter();
        DellLaptop dellobj = new DellLaptop(adapter);
        dellobj.charge();
        dellobj.removeCharge();
    }
}

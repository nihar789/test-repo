public class Car {
    int x =5;
    String name = "Hello World";
    String model ="2025";
    String fname = "Mary";
    String  lname = "Alice";

    int age = 20;

    public static void main(String[] args) {
        Car myobj = new Car();
        System.out.println(myobj.x);
        System.out.println(myobj.name);
        System.out.println(myobj.model);

        System.out.println("Name: "+ myobj.fname+" "+myobj.lname+ " age "+myobj.age);

    }

}

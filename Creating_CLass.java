public class Creating_CLass {
    //Creating a class method

    static void  myMethod(int age, String name){
        System.out.println("Hello Java!");
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        myMethod(20, "Alice");
        myMethod(30, "John");
    }
}

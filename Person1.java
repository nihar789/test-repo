public class Person1 {
    String name;
    int age;

    public Person1(String n, int a){
        name= n;
        age = a;
    }

    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
    }
    public static void main(String[] args) {
        Person1 myobj = new Person1("Alice",20);
        myobj.show();

        Person1 myobj1 =new Person1("Krish",30);
        myobj1.show();
    }
}
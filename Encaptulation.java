import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Encaptulation {
    //private attributes
    private String name;
    private int age;


    //constructor
    public Encaptulation(String name, int age){
        this.name = name;
        this.age=age;
    }

    //public getter method for name attribute
    public String getName(){
        return name;
    }

    //getter for age
    public int getAge(){
        return age;
    }

    //public setter method for name attribute
    public void setName(String name){
        this.name = name;
    }

    //setter for age
    public void setAge(int age){
        if (age>0){
            this.age=age;
        }else {
            System.out.println("Invalid age!");
        }
    }

    //display the hidden parametes
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Encaptulation encaptulation = new Encaptulation("Nihar",20);
        encaptulation.displayInfo();
        encaptulation.setName("Mary Alice");
        encaptulation.setAge(30);
        encaptulation.displayInfo();
    }
}

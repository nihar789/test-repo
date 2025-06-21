public class Rectangle {
    //public method
    public int calculate_area(int length, int width){
        return length*width;
    }

    public int calculate_perimeter(int length, int width){
        return 2*(length+width);
    }
    public static void main(String[] args) {

        //Creating an instance of a new Object
        Rectangle myobj = new Rectangle();

        //calling a methord
        int result = myobj.calculate_area(5,8);
        int perimeter = myobj.calculate_perimeter(5,8);
        System.out.println("Area of the Rectangle is: "+result);
        System.out.println("Perimeter: "+perimeter);

    }
}

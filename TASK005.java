public class TASK005 {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        if (b!=0){
            return a/b;
        }else {
            System.out.println("Cannot divide by 0");
            return 0;
        }
    }

    public static void main(String[] args) {
        int a =10;
        int b=5;

        System.out.println("Addition: "+add(a,b));
        System.out.println("Difference: "+sub(a,b));
        System.out.println("Multiply: "+multiply(a,b));
        System.out.println("Division: "+divide(a,b));

    }
}

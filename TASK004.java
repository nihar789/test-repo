public class TASK004 {
    public static void main(String[] args) {
        int a =2;
        int b=3;

        System.out.println("Before snapping a is "+a+" and b is "+b);

        int temp = a;
        a = b;
        b= temp;
        System.out.println("After Swapping: a is "+a+" b is "+b);

    }
}

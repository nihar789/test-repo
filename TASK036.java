public class TASK036 {
    public static void add(int x, float y) {
        System.out.println("Add(int, float):x ="+x+",y="+y);
        System.out.println("Sum: "+(x+y));
    }

    public static void add(float x, int y) {
        System.out.println("Add(float,int):x="+x+", y ="+y);
        System.out.println("Sum: "+(x+y));
    }

    public static void main(String[] args) {
        add(10, 50F);
        add(100.80F,60);
    }
}

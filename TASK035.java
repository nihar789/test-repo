public class TASK035 {
    public static void add(char x, char y) {
        System.out.println("Add(char, char):x = "+x+",y="+y+"(ASCII values)");
        System.out.println("Sum of ASCII values: "+((int)x+(int)y));
    }

    public static void add(int x, int y) {
        System.out.println("Add(int,int):x ="+x+",y="+y);
        System.out.println("Sum :"+(x+y));
    }

    public static void main(String[] args) {
        add('d','a');
        add(100,100);
    }
}

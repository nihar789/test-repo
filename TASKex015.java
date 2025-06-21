class OuterClass5 {
    int x = 10;
    static class InnerClass5 {
        static int y = 5;
    }
}
public class TASKex015 {
    public static void main(String[] args) {
        OuterClass5.InnerClass5 myInner5 = new OuterClass5.InnerClass5();
        System.out.println(myInner5.y);

    }
}

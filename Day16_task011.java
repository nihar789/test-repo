//public class RecLoop {
//
//     public int calc(int n) {
//        if (n == 0) return 0;
//        return n + calc(n);
//    }

//

public class Day16_task011 {
    public int calc(int n) {
        if (n == 0) return 0;

        return n + calc(n - 1);


        //return calc -1

    }

    public static void main(String[] args) {
        Day16_task011 rl = new Day16_task011();

        System.out.println(rl.calc(5));
    }
}

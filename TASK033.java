public class TASK033 extends Customer {

    String items = "onions";
    int cost = 30;

    void billing(){
    }
    public static void main (String[] args) {
        TASK033 obj = new TASK033();

        obj.items = "Potatoes";
        obj.cost = 50;

        System.out.println(obj.items);
        System.out.println(obj.cost);
        System.out.println("%%%%%%%%%%%%%%");
        System.out.println(((Customer)obj).items);
        System.out.println(((Customer)obj).cost);
    }
}
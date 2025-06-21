public class TASK034{
    static void add(int x, int y){
        System.out.println(x+ " &&& "+ y);
    }
    static void add(int x, int y, int z){
        System.out.println(x + " $$$ "+ y+ " $$$"+ z);
    }
    public static void main(String[] args){
        TASK034 tobj = new TASK034();
        add(10,20);
        add(100,200,300);
    }
}

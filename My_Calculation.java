class calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

public class My_Calculation extends calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }
    public static class My_Calculation2 extends calculation {
        public void divide(int x, int y) {
            z = x / y;
            System.out.println("The divition of the given numbers:" + z);
        }


        public static void main(String args[]) {
            int a = 20, b = 10;
            My_Calculation demo = new My_Calculation();
            My_Calculation2 omo = new My_Calculation2();
            demo.addition(a, b);
            demo.Subtraction(a, b);
            demo.multiplication(a, b);
            omo.divide(a, b);
        }
    }}




public class Polymorphism_method_overloading {
    //methord with 2 parameters

    static int add(int a, int b){
        return a+b;
    }
    //method with 3 parameters
    static int add(int a, int b, int c){
        return a+b+c;
    }
    //method with double type parameters
    static double add(double a, double b){
        return a+b;
    }

    static String add(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        //calling overloaded methods

        int sum1 =add(5,4);
        int sum2 =add(5,4,2);
        double sum3 =add(5.5,2.1);

        //displaying results

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}

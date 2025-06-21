public class Myclass {

    public int publicVariab;

    //private attibute
    private int privateVariable;

    //protected attibute
    protected int protectedVariable;

    //default package-variable
    int privatepackagevariable;

    //public method
    public void publicMethord(){
        System.out.println("This is a Public Method.");
    }

    //private method
    private void privateMethod(){
        System.out.println("This is a private Method.");
    }

    //protected method
    protected void protectedMthod(){
        System.out.println("This is a protected method.");
    }

    //default package-method
    void PrivatePackageDefaultMethod(){
        System.out.println("This is Private Package Default Method.");
    }

    public static void main(String[] args) {
        Myclass obj = new Myclass();

        obj.privateMethod(); //private is accesible inside self class
        obj.protectedMthod(); //self class accesible protectd method

        obj.PrivatePackageDefaultMethod();
    }
}

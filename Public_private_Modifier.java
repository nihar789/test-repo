public class Public_private_Modifier extends Myclass{

    //access public methord and attributes

    public static void main(String[] args) {
        //creating an instance
        Myclass myobj = new Myclass();
        myobj.publicMethord();
//        myobj.private

        Public_private_Modifier myobj2 = new Public_private_Modifier();
        myobj2.protectedMthod();//derived access of protected methord by extending Parent class
    }
}

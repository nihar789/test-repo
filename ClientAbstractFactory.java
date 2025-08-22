package Abstract_Factory_Pattern_Implementation;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        Mobile Mobj = MobileStore.getMobile("Abstract_Factory_Pattern_Implementation.Apple", "iphone16");
        Mobj.getDesc();
        System.out.println("...");
    }
}

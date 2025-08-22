package Abstract_Factory_Pattern_Implementation;

public class MobileStore {
    private MobileStore() {
        System.out.println("hello welcome to the world of Abstract_Factory_Pattern_Implementation.Mobile");
    }

    public static Mobile getMobile(String brand, String model) {
        if (brand.equals("Abstract_Factory_Pattern_Implementation.Apple")) {
            System.out.println("Here are your Abstract_Factory_Pattern_Implementation.Apple Models");
            return Apple.getMobile(model);
        }
        return new NoMobile();
    }
}

public class MobileStore {
    private MobileStore() {
        System.out.println("hello welcome to the world of Mobile");
    }

    public static Mobile getMobile(String brand, String model) {
        if (brand.equals("Apple")) {
            System.out.println("Here are your Apple Models");
            return Apple.getMobile(model);
        }
        return new NoMobile();
    }
}

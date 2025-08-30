package Abstract_Factory_Pattern_Implementation;

public class Mobile {
    String desc;

    public Mobile(String model) {
        this.desc = model;
    }

    public void getDesc() {
        System.out.println(desc);
    }
}
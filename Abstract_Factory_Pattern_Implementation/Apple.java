package Abstract_Factory_Pattern_Implementation;

import java.util.Objects;

public class Apple {
    private Apple() {}

    public static Mobile getMobile(String model) {
        if (Objects.equals(model, "iphone16")) {
            return new Mobile("Here is your iphone 16");
        } else if (Objects.equals(model, "iphone16MaxPro")) {
            return new Mobile("Here is your iphone 16 Max Pro");
        }
        return new NoMobile();
    }
}

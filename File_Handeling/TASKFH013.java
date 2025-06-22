import java.util.ArrayList;
import java.util.List;

public class TASKFH013 {
    static List<String> fullName = new ArrayList<>();

    public static void main(String[] args) {
        fullName.add("AA, BB");
        fullName.add("BB, CC");
        fullName.add("CC, DD");
        fullName.add("DD, FF");
        fullName.add("FF, GG");

        System.out.println("Friends List: " + fullName);
    }
}

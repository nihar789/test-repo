import java.util.ArrayList;
import java.util.List;

public class TASKFH014 {
    static List<String> fullName = new ArrayList<>();

    public static List getname(){
        fullName.add("AA, BB");
        fullName.add("BB, CC");
        fullName.add("CC, DD");
        fullName.add("CC, FF");
        fullName.add("FF, GG");
        return fullName;
    }

    public static void main(String[] args) {
        List<String> myNames = getname();
        System.out.println("Filetered Names:");
        myNames.stream()
                .filter((p)->p.startsWith("CC"))
                .map((p)->p.toUpperCase())
                .sorted()
                .forEach((p)-> System.out.println(p));

    }
}

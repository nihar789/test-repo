import java.io.*;
public class TASKFH008 {
    public static void main(String[] args) {
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);
        f1.renameTo(f2);
        System.out.println("Renamed file "+f1+" to "+f2);
    }
}

package StringHandeling;
public class TASK015 {
    public static void main(String[] args) {
        String str1 = "Java Strings";
        String str2 = new String(str1);
        String str3 = new String("are easy to learn");
        char[] ch = {'S','t','r','i','n','g'};
        String str4 = new String(ch);

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        System.out.println("str3: "+str3);
        System.out.println("str4: "+str4);
    }
}
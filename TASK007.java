import java.util.Scanner;
public class TASK007 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your id:");
        String id= scanner.nextLine();

        System.out.println("Please enter you password: (use numbers)");
        int passwprd = scanner.nextInt();

        System.out.println(" Hi,");
        System.out.println("Your login ID is "+ id );
        System.out.println("Your password is :"+passwprd);
    }

}

import java.util.Scanner;
public class TASK012_While_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String loginid;
        String password;
        int count =0;

        while (true){
            System.out.println("Enter your login ID: ");
            loginid= scanner.nextLine();

            System.out.println("Enter your password: ");
            password=scanner.nextLine();

            if (loginid.equals("Nihar")&& password.equals("1234567")){
                count++;
                System.out.println("You have logged in for "+count+" times.\n");
            }else {
                System.out.println("Invalid login or password. Try again.\n");
            }
        }
    }
}
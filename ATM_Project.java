import java.util.Scanner;

public class ATM_Project {

    private double balance;

    private Scanner scanner;

    // Constructer
    public ATM_Project(){
        balance = 1000.00; //initial balance
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        // To show the entry options to the user
        System.out.println("ATM Menu.");
        System.out.println("1. Check Balance.");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void checkBalance(){
        System.out.println("Your Balance is Rs. "+balance);
    }

    public void deposit(){
        System.out.println("Enter the amount you would like to Deposit: Rs.");
        double amount = scanner.nextDouble();
        if (amount>0){
            balance+=amount;
            System.out.println("You have deposited Rs. "+amount);
        }else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public void withdraw(){
        System.out.println("Enter the amount to withdraw below :");
        double amount = scanner.nextDouble();
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Rs. "+amount+" has been withdrawn.");
        }else if (amount>balance){
            System.out.println("Insufficient funds. Your balance is Rs. "+balance);
        }else {
            System.out.println("Invalid information. Please enter a the amount you would like to withdraw.");
        }
    }


    public static void main(String[] args) {
        ATM_Project atm = new ATM_Project();

        while (true){
            atm.displayMenu();
            System.out.println("Enter your choise :");
            int choise =atm.scanner.nextInt();

            switch (choise){
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using us. Please come back soon.");
                    break;
                default:
                    System.out.println("Invalid choise. Please select a valid choise.");
                    break;
            }
        }

    }
}

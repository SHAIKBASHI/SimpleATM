import java.util.Scanner;
 public class simpleatm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance=10000;//intial balance
        int pin=1234;
        //Login
        System.out.println("Enter your 4-digit pin:");
        int enterpin=sc.nextInt();
        if(enterpin!=pin){
            System.out.println("Incorrect PIN Exiting..");
            return;
        }
        int choice;
        do {
             System.out.println("\n====== ATM MENU ======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your current balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited " + deposit);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn " + withdraw);
                    } else {
                        System.out.println("Invalid or Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Visit again.");
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }

        }while (choice !=4);
        sc.close();
        
    }
 }
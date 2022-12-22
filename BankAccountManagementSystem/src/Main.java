import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank("First Bank");

        while(true) {
            System.out.println("Welcome!");
            System.out.println("1 - Create a new bank account");
            System.out.println("2 - Deposit money");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Check your account balance");
            System.out.println("5 - Transfer money");
            System.out.println("6 - View transactions");
            System.out.println("7 - Exit");
            System.out.print("Choose your option: ");

            int command = Integer.parseInt(sc.nextLine());

            if (command == 1) {
                System.out.print("Enter your account holder name: ");
                String accountHolder = sc.nextLine();
                System.out.print("Enter your account number: ");
                String accountNumber = sc.nextLine();
                System.out.print("Enter your initial balance: ");
                double balance = Double.parseDouble(sc.nextLine());

                BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
                bank.addAccount(account);
            } //TODOs
        }
    }
}
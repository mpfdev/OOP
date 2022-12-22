import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;

        transactions.add(new Transaction("deposit", amount, new Date()));
    }

    public void withdrawl(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient!");
        }

        balance -= amount;
        transactions.add(new Transaction("withdraw", amount, new Date()));
    }

    public void transfer(BankAccount destination, double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient!");
        }

        balance -= amount;
        destination.deposit(amount);

        transactions.add(new Transaction("transfer", amount, new Date()));
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}

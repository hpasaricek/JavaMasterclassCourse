import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountName;
    private int balance = 0;
    private List<Integer> transactions = new ArrayList<>();

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            balance += amount;
            System.out.println(amount + " deposited. Balance is now " + balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            transactions.add(withdrawal);
            balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + balance);
        } else {
            System.out.println("Cannot withdraw negative sums;");
        }
    }

    public void calculateBalance() {
        balance = 0;
        for (int i: transactions) {
            balance += i;
        }
        System.out.println("Calculated balance is " + balance);
    }
}

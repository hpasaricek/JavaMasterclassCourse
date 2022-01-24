public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double amount) {
        this.accountName = accountName;
        this.balance = amount;
    }

    public double deposit(double amount, boolean branch) {
        if ((amount > 500) && !branch) {
            throw new IllegalArgumentException();
        }
        balance += amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}

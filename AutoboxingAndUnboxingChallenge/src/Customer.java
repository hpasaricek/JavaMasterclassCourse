import java.util.ArrayList;

public class Customer {
    private String customerName;
    private double initialTransaction;
    private ArrayList<Double> customerTransactions = new ArrayList<>();

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.initialTransaction = initialTransaction;
    }

    public void makeTransaction(double amount) {
        customerTransactions.add(amount);
        System.out.println("Made a transaction:\n" + customerName + " -> " + amount);
    }

    public void showTransactions() {
        System.out.println("Name: " + customerName + "\n Transactions:");
        for (double amount : customerTransactions) {
            System.out.println("\t" + amount);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getInitialTransaction() {
        return initialTransaction;
    }
}

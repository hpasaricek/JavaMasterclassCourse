import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        }

        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) == null) {
            return false;
        }

        return findBranch(branchName).newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) == null) {
            return false;
        }

        return findBranch(branchName).addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        System.out.println("Customer details for branch " + branch.getName());
        int i = 1;
        for (Customer customer : branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + i + "]");
            if (printTransactions) {
                System.out.println("Transactions");
                int j = 1;
                for (Double transactions : customer.getTransactions()) {
                    System.out.println("[" + j + "]  Amount " + transactions);
                    j++;
                }
            }
            i++;
        }
        return true;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }

        return null;
    }
}

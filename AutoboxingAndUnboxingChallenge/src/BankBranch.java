import java.util.ArrayList;

public class BankBranch {
    private String bankBranchName;
    private ArrayList<Customer> branchCustomerList = new ArrayList<>();

    public BankBranch(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public void addCustomer(Customer customer) {
        if (!customerExists(customer)) {
            System.out.println("Added new customer: " + customer.getCustomerName() + " to this branch.");
            branchCustomerList.add(customer);
            customer.makeTransaction(customer.getInitialTransaction());
        } else {
            System.out.println("Customer with name: " + customer.getCustomerName() + " already exists in this branch.");
        }
    }

    public void makeTransaction(Customer customer, double amount) {
        if (customerExists(customer)) {
            customer.makeTransaction(amount);
        }
    }

    public void showCustomers() {
        System.out.println("Customers in branch " + bankBranchName + " are:");
        for (int i = 0; i < branchCustomerList.size(); i++) {
            System.out.println((i + 1) + ". " + branchCustomerList.get(i).getCustomerName());
        }
    }

    private int customerIndex(String customerName) {
        for (int i = 0; i < branchCustomerList.size(); i++) {
            String existingCustomerName = branchCustomerList.get(i).getCustomerName();
            if (existingCustomerName.equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    private boolean customerExists(Customer customer) {
        int customerIndex = customerIndex(customer.getCustomerName());

        if (customerIndex >= 0) {
            return true;
        }

        System.out.println("Customer with name: " + customer.getCustomerName() + " doesn't exist in this branch.");
        return false;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public Customer getCustomer(int customerIndex) {
        return branchCustomerList.get(customerIndex);
    }
}

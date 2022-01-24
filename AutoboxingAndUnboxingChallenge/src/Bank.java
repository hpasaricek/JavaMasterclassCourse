import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<BankBranch> bankBranches = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addBankBranch(BankBranch bankBranch) {
        if (!bankBranchExists(bankBranch)) {
            bankBranches.add(bankBranch);
            System.out.println("Added new bank branch: " + bankBranch.getBankBranchName() + " to " + bankName + ".");
        }
    }

    public void addCustomer(BankBranch bankBranch, Customer customer) {
        if (bankBranchExists(bankBranch)) {
            bankBranch.addCustomer(customer);
        }
    }

    public void makeTransaction(BankBranch bankBranch, Customer customer, double amount) {
        if (bankBranchExists(bankBranch)) {
            bankBranch.makeTransaction(customer, amount);
        }
    }


    public void showBranches() {
        System.out.println("Branches of " + bankName + " are:");
        for (int i = 0; i < bankBranches.size(); i++) {
            System.out.println((i + 1) + ". " + bankBranches.get(i).getBankBranchName());
        }
    }

    private int bankBranchIndex(String bankBranchName) {
        for (int i = 0; i < bankBranches.size(); i++) {
            String existingBankBranchName = bankBranches.get(i).getBankBranchName();
            if (existingBankBranchName.equals(bankBranchName)) {
                return i;
            }
        }
        return -1;
    }

    private boolean bankBranchExists(BankBranch bankBranch) {
        int bankBranchIndex = bankBranchIndex(bankBranch.getBankBranchName());

        if (bankBranchIndex < 0) {
            System.out.println("Bank branch " + bankBranch.getBankBranchName() + " doesn't exist.");
            return false;
        }
        return true;
    }

    public BankBranch getBankBranch(int bankBranchIndex) {
        return bankBranches.get(bankBranchIndex);
    }
}

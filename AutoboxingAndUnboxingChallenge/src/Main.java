import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank;

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println("\nEnter bank name:");
        bank = new Bank(scanner.nextLine());

        while (!quit) {
            displayOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBankBranch();
                    break;
                case 2:
                    showBranches();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    makeTransaction();
                    break;
                case 5:
                    showTransactions();
                    break;
                case 6:
                    showBankBranchCustomers();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong number entered, try again.");
                    break;
            }
        }
    }

    private static void displayOptions() {
        System.out.println("---------------");
        System.out.println("1. Add bank branch.\n" +
                "2. Show bank branches.\n" +
                "3. Add customer.\n" +
                "4. Make transaction.\n" +
                "5. Show transactions for customer.\n" +
                "6. Show customers in bank branch.\n" +
                "7. Quit.");
        System.out.println("---------------");
        System.out.print("Enter your choice:");
    }

    private static void addBankBranch() {
        System.out.println("Enter the name of the bank branch:");
        String bankBranchName = scanner.nextLine();

        bank.addBankBranch(new BankBranch(bankBranchName));
    }

    private static BankBranch getBankBranch() {
        bank.showBranches();
        System.out.println("Enter bank branch number:");
        int branchIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        return bank.getBankBranch(branchIndex);
    }


    private static void addCustomer() {
        BankBranch bankBranch = getBankBranch();

        System.out.println("Enter new customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter initial transaction amount:");
        double initialTransaction = scanner.nextDouble();
        scanner.nextLine();

        bank.addCustomer(bankBranch, new Customer(customerName, initialTransaction));
    }

    private static Customer getCustomer(BankBranch bankBranch) {
        bankBranch.showCustomers();
        System.out.println("Enter customer number:");
        int customerIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        return bankBranch.getCustomer(customerIndex);
    }

    private static void makeTransaction() {
        BankBranch bankBranch = getBankBranch();
        Customer customer = getCustomer(bankBranch);

        System.out.println("Enter the amount of the transaction:");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine();

        bank.makeTransaction(bankBranch, customer, transactionAmount);
    }

    private static void showBranches() {
        bank.showBranches();
    }

    private static void showBankBranchCustomers() {
        BankBranch bankBranch = getBankBranch();
        bankBranch.showCustomers();
    }

    private static void showTransactions() {
        BankBranch bankBranch = getBankBranch();
        Customer customer = getCustomer(bankBranch);
        customer.showTransactions();
    }
}

public class BankAccount {
    private String bankAccountNumber;
    private double bankBalance;
    private String bankCustomerName;
    private String bankCustomerEmail;
    private String bankCustomerPhone;

    public BankAccount() {
        this("XXXXX", 0.0, "Default", "Default", "Default");
        System.out.println("Empty constructor call.");
    }

    public BankAccount(String bankAccountNumber, double bankBalance, String bankCustomerName, String bankCustomerEmail, String bankCustomerPhone) {
        System.out.println("Account constructor with parameters called.");
        this.bankAccountNumber = bankAccountNumber;
        this.bankBalance = bankBalance;
        this.bankCustomerName = bankCustomerName;
        this.bankCustomerEmail = bankCustomerEmail;
        this.bankCustomerPhone = bankCustomerPhone;
    }

    public BankAccount(String bankCustomerName, String bankCustomerEmail, String bankCustomerPhone) {
        this("XXXXX", 0.00, bankCustomerName, bankCustomerEmail, bankCustomerPhone);
    }

    public void depositFunds(double depositAmount) {
        this.bankBalance += depositAmount;
        System.out.println("You have deposited " + depositAmount + "$ to your account. \n" +
                "Your current balance is " + this.bankBalance + "$.");
    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.bankBalance < withdrawAmount) {
            System.out.println("Not enough funds on your bank balance.");
        } else {
            this.bankBalance -= withdrawAmount;
            System.out.println("You have withdrawn " + withdrawAmount + "$ from your account. \n" +
                    "Your current balance is " + this.bankBalance + "$.");
        }
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getBankCustomerName() {
        return bankCustomerName;
    }

    public void setBankCustomerName(String bankCustomerName) {
        this.bankCustomerName = bankCustomerName;
    }

    public String getBankCustomerEmail() {
        return bankCustomerEmail;
    }

    public void setBankCustomerEmail(String bankCustomerEmail) {
        this.bankCustomerEmail = bankCustomerEmail;
    }

    public String getBankCustomerPhone() {
        return bankCustomerPhone;
    }

    public void setBankCustomerPhone(String bankCustomerPhone) {
        this.bankCustomerPhone = bankCustomerPhone;
    }

}

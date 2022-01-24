public class VipCustomer {
    private String vipName;
    private double vipCreditLimit;
    private String vipEmailAddress;

    public VipCustomer(String vipName, double vipCreditLimit, String vipEmailAddress) {
        this.vipName = vipName;
        this.vipCreditLimit = vipCreditLimit;
        this.vipEmailAddress = vipEmailAddress;
    }

    public VipCustomer() {
        this("Unknown name", 10000.00, "Unknown email address");
    }


}

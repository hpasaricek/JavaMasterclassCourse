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
        this("Unknown name", 50000.00, "Unknown email address");
    }

    public VipCustomer(String vipName, double vipCreditLimit) {
        this(vipName, vipCreditLimit, "Unknown email address");
    }

    public String getVipName() {
        return vipName;
    }

    public double getVipCreditLimit() {
        return vipCreditLimit;
    }

    public String getVipEmailAddress() {
        return vipEmailAddress;
    }
}

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy burger", meat, price, "Rye bread");
    }

    public void addHealthyAddition1(String name, double price) {
        this.price += price;
        System.out.println("Added 1.st addition " + name + " to hamburger. Extra price is: " + price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.price += price;
        System.out.println("Added 2.nd addition " + name + " to hamburger. Extra price is: " + price);
    }

    @Override
    public double itemizehamburger() {
        return super.itemizehamburger();
    }
}

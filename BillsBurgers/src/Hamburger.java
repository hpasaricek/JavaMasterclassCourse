public class Hamburger {
    private String name;
    private String meat;
    double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println("Created new " + name + " hamburger. \nMeat: " + meat + "\nBread type: " + breadRollType + "\nPrice: " + price + "$");
    }

    public void addHamburgerAddition1(String name, double price) {
        this.price += price;
        System.out.println("Added 1.st addition " + name + " to hamburger. Extra price is: " + price);
    }

    public void addHamburgerAddition2(String name, double price) {
        this.price += price;
        System.out.println("Added 2.nd addition " + name + " to hamburger. Extra price is: " + price);
    }

    public void addHamburgerAddition3(String name, double price) {
        this.price += price;
        System.out.println("Added 3.rd addition " + name + " to hamburger. Extra price is: " + price);
    }

    public void addHamburgerAddition4(String name, double price) {
        this.price += price;
        System.out.println("Added 4.th addition " + name + " to hamburger. Extra price is: " + price);
    }

    public double itemizehamburger() {
        System.out.println("Total price of the " + this.name + " burger is: " + this.price);
        return this.price;
    }

}

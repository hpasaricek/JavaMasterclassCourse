public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Burger", "Premium beef", 19.10, "Brioche");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to Deluxe Burger.");
    }
}

public class DeluxeBurger extends Burger {
    public DeluxeBurger(String breadType, String meatType) {
        super(breadType, meatType);
        this.setBurgerName("Bills Deluxe Burger");
        this.setBasePrice(11.00);
        this.addAddition();
    }

    @Override
    public void chooseAddition() {
        System.out.println("No extra additions allowed on Deluxe Burger.");
    }

    public void addAddition() {
        this.setTotalCombo("Drink -> 1.50$\nSnack -> 2.00$");
        this.setTotalPriceOfAdditions(this.getTotalPriceOfAdditions() + 4.00);
    }
}

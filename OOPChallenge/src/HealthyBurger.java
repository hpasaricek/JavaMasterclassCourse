public class HealthyBurger extends Burger{

    public HealthyBurger(String breadType, String meatType) {
        super(breadType, meatType);
        this.setBurgerName("Bills Healthy Burger");
        this.setBasePrice(10.00);
    }

    @Override
    public void chooseAddition() {
        this.setNumOfAdditions(6);
        super.chooseAddition();
    }
}

public class Main {
    public static void main(String[] args) {
        /*Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);

        System.out.println("Total burger price is " + hamburger.itemizeHamburger());*/

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentil", 3.0);
        System.out.println("Total healthy burger price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        System.out.println(db.itemizeHamburger());
        db.addHamburgerAddition1("Cheese",2.34);
    }
}

import java.util.Scanner;

public class Burger {
    private String burgerName = "Bills Classic Burger";
    private String breadType;
    private String meatType;
    private double basePrice = 8.00;
    private double totalPriceOfAdditions;
    private int numOfAdditions = 4;
    private String totalCombo = "";

    public Burger(String breadType, String meatType) {
        this.breadType = breadType;
        this.meatType = meatType;
        chooseAddition();
    }

    private void displayAdditions() {
        System.out.println("1. Lettuce -> 1.00$");
        System.out.println("2. Tomato -> 1.50$");
        System.out.println("3. Onion -> 1.30$");
        System.out.println("4. Cheese -> 1.70$");
        System.out.println("5. Bacon -> 2.00$");
        System.out.println("6. Jalapeno pepper -> 1.50$");
        System.out.println("7. Red bell pepper -> 1.50$");
        System.out.println("8. Extra sauce -> 1.50$");
    }

    public void chooseAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can choose a maximum of " + numOfAdditions + " additions to your burger. \n" +
                "Press the corresponding number to choose the addition or press any other letter to exit.");
        displayAdditions();
        if (scanner.hasNextInt()) {
            while (numOfAdditions > 0) {
                addAddition(scanner.nextInt());
                scanner.nextLine();
                numOfAdditions--;
            }
        } else {
            System.out.println("Stopped choosing additions.");
        }

        if (numOfAdditions == 0) {
            System.out.println("You have added the maximum number of additions.");
        }
    }

    public void addAddition(int additionNum) {
        switch (additionNum) {
            case 1:
                System.out.println("You have chosen lettuce.");
                totalPriceOfAdditions += 1.0;
                totalCombo += "Lettuce -> 1.00$\n";
                break;
            case 2:
                System.out.println("You have chosen tomato.");
                totalPriceOfAdditions += 1.50;
                totalCombo += "Tomato -> 1.50$\n";
                break;
            case 3:
                System.out.println("You have chosen onion.");
                totalPriceOfAdditions += 1.3;
                totalCombo += "Onion -> 1.30$\n";
                break;
            case 4:
                System.out.println("You have chosen cheese.");
                totalPriceOfAdditions += 1.7;
                totalCombo += "Cheese -> 1.70$\n";
                break;
            case 5:
                System.out.println("You have chosen bacon.");
                totalPriceOfAdditions += 2.0;
                totalCombo += "Bacon -> 2.00$\n";
                break;
            case 6:
                System.out.println("You have chosen drink.");
                totalPriceOfAdditions += 1.5;
                totalCombo += "Drink -> 1.50$\n";
                break;
            default:
                System.out.println("Wrong input chosen.");
                break;
        }
    }

    public void displayTotalPrice() {
        System.out.println(burgerName + " -> " + basePrice + "$ \n"
                + totalCombo + "\nTotal price is: " + (basePrice + totalPriceOfAdditions) + "$");
    }

    public void setNumOfAdditions(int numOfAdditions) {
        this.numOfAdditions = numOfAdditions;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getTotalPriceOfAdditions() {
        return totalPriceOfAdditions;
    }

    public void setTotalPriceOfAdditions(double totalPriceOfAdditions) {
        this.totalPriceOfAdditions = totalPriceOfAdditions;
    }

    public void setTotalCombo(String totalCombo) {
        this.totalCombo = totalCombo;
    }
}

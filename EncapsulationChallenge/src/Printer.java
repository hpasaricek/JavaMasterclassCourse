public class Printer {
    private String manufacturer;
    private String model;
    private int tonerLevel = 30;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(String manufacturer, String model, boolean isDuplex) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerAmount) {
        if (tonerLevel == 100) {
            System.out.println("Toner level is already at maximum level.");
        } else if (tonerLevel + tonerAmount > 100) {
            System.out.println("Too much toner amount to fill the toner. Please reduce the toner amount to maximum " + (100 - tonerLevel) + ".");
        } else {
            tonerLevel += tonerAmount;
            System.out.println("Filled toner to " + tonerLevel + ".");
        }
    }

    public void printPages(int pages) {

        pagesPrinted += isDuplex ? (int) Math.ceil((double) pages / 2) : pages;
        /*if (isDuplex) {
            pagesPrinted += (int) Math.ceil((double) pages / 2);
        } else {
            pagesPrinted += pages;
        }*/
        tonerLevel -= pages;
        System.out.println("Printed " + pages + " pages. Total pages printed: " + pagesPrinted);
    }

    public void displayTonerLevel() {
        System.out.println("Current toner level is " + tonerLevel);
    }

    public void displayPagesPrinted() {
        System.out.println("Total pages printed: " + pagesPrinted);
    }
}

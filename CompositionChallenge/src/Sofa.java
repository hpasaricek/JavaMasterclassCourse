public class Sofa {
    private String manufacturer;
    private String color;
    private int seats;

    public Sofa(String manufacturer, String color, int seats) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.seats = seats;
    }

    public void extendSofa() {
        System.out.println("Sofa extended so you can now lay down if you want.");
    }
}

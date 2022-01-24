public class TV {
    private String manufacturer;
    private String model;
    private int size;
    private String resolution;

    public TV(String manufacturer, String model, int size, String resolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public void pressPowerButton() {
        System.out.println("Pressed power button on the TV.");
    }
}

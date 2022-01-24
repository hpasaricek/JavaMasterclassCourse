public class GamingConsole {
    private String manufacturer;
    private String model;
    private int hardDriveSize;
    private String color;

    public GamingConsole(String manufacturer, String model, int hardDriveSize, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.hardDriveSize = hardDriveSize;
        this.color = color;
    }

    public void insertGameDisc() {
        System.out.println("Inserted a game disc into the console.");
    }
}

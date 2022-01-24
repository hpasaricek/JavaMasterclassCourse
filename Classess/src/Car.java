public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        this.model = (validModel.equals("carrera") || validModel.equals("commodore")) ? model : "Unknown";

    }

    public String getModel() {
        return this.model;
    }
}


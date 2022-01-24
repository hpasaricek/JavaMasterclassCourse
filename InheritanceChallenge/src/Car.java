public class Car extends Vehicle {
    private int numberOfWheels;
    private String typeOfEngine;
    private int fuelLevel = 10;

    public Car(String vehicleName, int numberOfWheels, String typeOfEngine){
        super(vehicleName);
        this.numberOfWheels = numberOfWheels;
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public void setVelocity(int velocity) {
        if (fuelLevel == 0){
            System.out.println("Not enough fuel to set velocity.");
        } else {
            super.setVelocity(velocity);
            fuelLevel -= 10;
        }
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}

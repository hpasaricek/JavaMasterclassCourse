public class Tesla extends Car {
    private boolean canFastCharge;

    public Tesla() {
        super("Tesla", 4, "Electric");
    }

    public void chargeBatteries(int powerSpeed) {
        int multiplier = canFastCharge ? (powerSpeed * 10) : (powerSpeed * 5);
        setFuelLevel(getFuelLevel() * multiplier);
    }
}

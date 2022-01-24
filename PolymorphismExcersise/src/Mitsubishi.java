public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> Starting Engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> Braking.";
    }
}

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> Starting Engine";
    }

    @Override
    public String accelerate() {
        return "Ford -> Accelerating";
    }

    @Override
    public String brake() {
        return "Ford -> Braking.";
    }
}

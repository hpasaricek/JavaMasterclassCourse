public class Main {
    public static void main(String[] args) {
        Car car = new Car("TestCar", "Black", 4);
        Peugeot peugeot208 = new Peugeot("Yellow", 3);
        Renault renaultClio = new Renault("Red", 4);
        Citroen citroenC4 = new Citroen("Grey", 6);

        peugeot208.accelerate();
        peugeot208.startEngine();
        peugeot208.accelerate();

        renaultClio.accelerate();
        renaultClio.startEngine();
        renaultClio.accelerate();

        citroenC4.accelerate();
        citroenC4.startEngine();
        citroenC4.accelerate();
    }
}

class Car {
    private String name;
    private String color;
    private int engineCylinders;
    private int wheels;
    private boolean engineIsOn;

    public Car(String name, String color, int engineCylinders) {
        this.name = name;
        this.color = color;
        this.engineCylinders = engineCylinders;
        this.wheels = 4;
        this.engineIsOn = false;
    }

    public void startEngine() {
        if (engineIsOn) {
            System.out.println("Car.starEngine() -> Engine already running.");
        } else {
            engineIsOn = true;
            System.out.println("Car.starEngine() -> Started car engine.");
        }
    }

    public void accelerate() {
        if (!engineIsOn) {
            System.out.println("Car.accelerate() -> Engine is off. Turn on the engine first.");
        } else {
            System.out.println("Car.accelerate() -> Car is accelerating.");
        }
    }

    public void brake() {
        System.out.println("Car.brake() -> Car is braking.");
    }

    public boolean isEngineIsOn() {
        return engineIsOn;
    }

    public void setEngineIsOn(boolean engineIsOn) {
        this.engineIsOn = engineIsOn;
    }
}

class Peugeot extends Car {
    public Peugeot(String color, int engineCylinders) {
        super("Renault", color, engineCylinders);
    }

    @Override
    public void startEngine() {
        if (this.isEngineIsOn()) {
            System.out.println("Peugeot.starEngine() -> Engine already running.");
        } else {
            this.setEngineIsOn(true);
            System.out.println("Peugeot.starEngine() -> Started car engine.");
        }
    }

    @Override
    public void accelerate() {
        if (!this.isEngineIsOn()) {
            System.out.println("Peugeot.accelerate() -> Engine is off. Turn on the engine first.");
        } else {
            System.out.println("Peugeot.accelerate() -> Car is accelerating.");
        }
    }

    @Override
    public void brake() {
        System.out.println("Peugeot.brake() -> Car is braking.");
    }
}

class Renault extends Car {
    public Renault(String color, int engineCylinders) {
        super("Renault", color, engineCylinders);
    }

    @Override
    public void startEngine() {
        if (this.isEngineIsOn()) {
            System.out.println("Renault.starEngine() -> Engine already running.");
        } else {
            this.setEngineIsOn(true);
            System.out.println("Renault.starEngine() -> Started car engine.");
        }
    }

    @Override
    public void accelerate() {
        if (!this.isEngineIsOn()) {
            System.out.println("Renault.accelerate() -> Engine is off. Turn on the engine first.");
        } else {
            System.out.println("Renault.accelerate() -> Car is accelerating.");
        }
    }

    @Override
    public void brake() {
        System.out.println("Renault.brake() -> Car is braking.");
    }
}

class Citroen extends Car {
    public Citroen(String color, int engineCylinders) {
        super("Citroen", color, engineCylinders);
    }

    @Override
    public void startEngine() {
        if (this.isEngineIsOn()) {
            System.out.println("Citroen.starEngine() -> Engine already running.");
        } else {
            this.setEngineIsOn(true);
            System.out.println("Citroen.starEngine() -> Started car engine.");
        }
    }

    @Override
    public void accelerate() {
        if (!this.isEngineIsOn()) {
            System.out.println("Citroen.accelerate() -> Engine is off. Turn on the engine first;");
        } else {
            System.out.println("Citroen.accelerate() -> Car is accelerating.");
        }
    }

    @Override
    public void brake() {
        System.out.println("Citroen.brake() -> Car is braking.");
    }
}
public class Vehicle {
    private String vehicleName;
    private int direction;
    private int speed;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
        this.direction = 0;
        this.speed = 0;
    }

    public void setVelocity(int velocity) {
        if ((this.speed + velocity) < 0) {
            stop();
        } else {
            this.speed += velocity;
            System.out.println("Vehicle.setVelocity(): Current velocity is " + this.speed + "km/h.");
        }
    }

    public void stop() {
        System.out.println("Vehicle.stop(): The vehicle has stopped.");
        this.speed = 0;
    }

    public void setDirection(int newDirection) {
        if (this.direction == newDirection) {
            System.out.println("Vehicle.setDirection(): Vehicle already going in that direction.");
        } else {
            System.out.println("Vehicle.setDirection(): Vehicle going at " + direction + " degrees.");
            this.direction = newDirection;
        }
    }


}

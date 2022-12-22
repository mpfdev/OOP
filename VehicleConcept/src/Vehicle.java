public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double speed;

    public Vehicle (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public abstract void accelerate();
    public abstract void brake();

    public double getSpeed() {
        return speed;
    }
}

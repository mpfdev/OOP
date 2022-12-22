public class Bicycle extends Vehicle{
    private int numGears;

    public Bicycle(String make, String model, int year, int numGears) {
        super(make, model, year);
        this.numGears = numGears;
    }

    @Override
    public void accelerate() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed -= 5;
    }
}

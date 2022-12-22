public class Circle extends Shape {
    private double radius;

    public Circle(String color,double r) {
        super(color);
        this.radius = r;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 2);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle("blue", 5, 3);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
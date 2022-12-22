public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Volkwagen","Gol", 1991, 4);
        System.out.println(myCar.getSpeed());

        for(int i = 1; i <= 5; i++) {
            myCar.accelerate();
        }

        System.out.println(myCar.getSpeed());

        for(int i = 1; i <= 3; i++) {
            myCar.brake();
        }

        System.out.println(myCar.getSpeed());
    }
}
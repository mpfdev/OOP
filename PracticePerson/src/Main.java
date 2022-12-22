public class Main {
    public static void main(String[] args) {
        Person blue = new Person("blue", "green", 20, "man");
        Person john = new Person("John", "Doe", 16, "man");
        Person jane = new Person("Jane", "Doe", 52, "woman");

        blue.sayHello();
        john.sayHello();
        jane.sayHello();
    }
}
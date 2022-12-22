public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + getFullName() + " and I am a " + gender);
    }
}

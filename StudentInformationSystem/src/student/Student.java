package student;

import course.Course;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private Date enrollmentDate;
    private List<Course> courses;

    public Student(String name, int age, Date enrollmentDate) {
        this.name = name;
        this.age = age;
        this.enrollmentDate = enrollmentDate;
        this.courses = new ArrayList<>();
    }

    public void enrollNewCourse(Course course) {
        if(!courses.contains(course) && course.getNumberOfStudents() <= course.getCapacity()) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enrollmentDate=" + enrollmentDate +
                ", courses=" + courses +
                '}';
    }
}

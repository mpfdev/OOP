package course;

import student.Student;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int capacity;
    private List<Student> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}

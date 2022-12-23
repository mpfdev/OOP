package manager;

import course.Course;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;
    private List<Course> courses;

    public StudentManager() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

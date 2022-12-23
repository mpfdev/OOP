package ui;

import manager.StudentManager;
import student.Student;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("1 - Add a new student");
            System.out.println("2 - View a list of all students");
            System.out.println("3 - View a student's details");
            System.out.println("4 - Enroll a student in a course");
            System.out.println("5 - View a list of courses");
            System.out.println("6 - Add a new course");
            System.out.println("7 - Exit");
            System.out.print("Enter your choice: ");
            int option = Integer.parseInt(sc.nextLine());

            if (option == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student age: ");
                int age = Integer.parseInt(sc.nextLine());
                Date enrollmentDate = new Date();
                Student newStudent = new Student(name,age,enrollmentDate);
                studentManager.addStudent(newStudent);
            } else if (option == 2) {
                for (Student student : studentManager.getStudents()) {
                    System.out.println(student);
                }
            } else if (option == 3) {
                //TODO
            } else if (option == 4) {
                //TODO
            } else {
                break;
            }
        }
    }
}
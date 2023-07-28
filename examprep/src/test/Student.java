package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private List<Double> marks;

    public Student(String studentId, String firstName, String lastName, List<Double> marks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public double calculateTotalMarks() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverageMarks() {
        double total = calculateTotalMarks();
        return total / marks.size();
    }

    public void displayStudentDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Marks: " + marks);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.printf("Average Marks: %.2f%n", calculateAverageMarks());
    }

    public static Student addStudent(Scanner scanner, List<Student> students) {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        List<Double> marks = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter mark " + i + ": ");
            double mark = scanner.nextDouble();
            marks.add(mark);
        }

        scanner.nextLine(); // Consume newline character after entering marks

        Student student = new Student(studentId, firstName, lastName, marks);
        students.add(student);

        return student;
    }
    
    public static Student searchStudentByName(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.firstName.equalsIgnoreCase(firstName) && student.lastName.equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return null;
    }
}

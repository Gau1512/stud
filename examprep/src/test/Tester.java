
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Details");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after entering choice

            switch (choice) {
                case 1:
                    Student.addStudent(scanner, students);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Student student : students) {
                            student.displayStudentDetails();
                        }
                    }
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.print("Enter first name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Enter last name: ");
                        String lastName = scanner.nextLine();
                        
                        Student foundStudent = Student.searchStudentByName(students, firstName, lastName);
                        if (foundStudent != null) {
                            System.out.println("\nStudent found:");
                            foundStudent.displayStudentDetails();
                        } else {
                            System.out.println("\nStudent not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
                    break;
            }
        }
    }
}

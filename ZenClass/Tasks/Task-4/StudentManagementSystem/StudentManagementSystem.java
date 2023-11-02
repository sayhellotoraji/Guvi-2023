package StudentManagementSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Exception Handling 2 Ways:
// 1. Handle the Exception using try catch block
// 2. Declare the Excetion in the method signature using throws

// Driver Code
public class StudentManagementSystem {

    public static void main(String[] args) {
        
        // Read number of Students
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int no_of_Students = Integer.parseInt(sc.nextLine());

        Student student;
        
        // Each Student should contain unique roll numbers
        // Because there is possibility that name, age & course 
        // might be same for 2 people
        Set<Integer> unique_roll_no = new HashSet<>();

        // Array list to store Student Information
        List<Student> student_info = new ArrayList<>();

        for (int i = 0; i < no_of_Students; i++) {
            System.out.println("\nStudent " + (i + 1) + " Information");

            // Condition to check unique Roll Numbers
            System.out.println("Enter Roll No: ");
            int roll_no = Integer.parseInt(sc.nextLine());

            while (unique_roll_no.contains(roll_no)) {
                System.out.println("Please Enter Unique Roll No:");
                roll_no = Integer.parseInt(sc.nextLine());
            }
            unique_roll_no.add(roll_no);

            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Course: ");
            String course = sc.nextLine();

            // Method 2: Handle the Exceptions using try - catch
            try {
                // Create Student object & Add to Arraylist
                student = new Student(roll_no, name, age, course);
                student_info.add(student);
            }

            // If any 1 of the 2 Exception arises 
            // Student is not added in Student info list
            catch (AgeNotWithinRangeException | NameNotValidException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nStudents Information");
        if (student_info.isEmpty())
            System.out.println("Students List is Empty:");
        else
            System.out.println(student_info);

        sc.close();

    }
}
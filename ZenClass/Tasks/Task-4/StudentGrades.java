
//Use of Map in Java

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hashmap stores key - value pairs
        // key = student name
        // value = grades
        Map<String, Character> students = new HashMap<>();

        System.out.println("Add number of Students:");
        int no_of_students = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Student name and Grades:");
        String student_name;
        char grades;

        while (no_of_students > 0) {
            System.out.println("Enter Name");
            student_name = sc.nextLine();

            System.out.println("Enter Grades");
            grades = sc.nextLine().charAt(0);

            // a. Add new Student to hashmap
            students.put(student_name, grades);

            no_of_students--;
        }
        // ************************************************************ */

        // b.Remove an existing Student
        System.out.println("\nEnter name of Student to be removed:");
        String remove_student = sc.nextLine();


        // Student list can be empty so check for exception
        try {
            Character flag = students.remove(remove_student);
            if (flag != null)
                System.out.println("Removed Successfully.");
            else
                System.out.println("Entered Name is not Available");
        }

        catch (NullPointerException e) {
            System.out.println("Students list is Empty");
        }

        // ************************************************************ */

        // c. Search a student by name and display grade
        System.out.println("\nFind Grade for Student:");
        String search_name = sc.nextLine();

        // Student list can be empty so check for exception
        try {
            Character grade = students.get(search_name);
            if (grade != null)
                System.out.println("Student: " + search_name + ", Grade: " + grade);
            else
                System.out.println("Entered Name is not Available");
        }

        catch (NullPointerException e) {
            System.out.println("Students list is Empty");
        }

        sc.close();
    }
}

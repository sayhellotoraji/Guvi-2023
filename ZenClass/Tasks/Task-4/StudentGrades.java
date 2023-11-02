
//Use of Map in Java

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Driver Code
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hashmap stores key - value pairs
        // key = student name
        // value = grades
        Map<String, Integer> students = new HashMap<>();

        System.out.println("Add number of Students:");
        int no_of_students = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Student name and Grades:");
        String student_name;
        int grades;

        int counter = 1;
        while (counter <= no_of_students) {
            System.out.println("Enter Name: " + counter);
            student_name = sc.nextLine();

            System.out.println("Enter Grades 5-10:");
            grades = Integer.parseInt(sc.nextLine());

            // a. Add new Student to hashmap
            students.put(student_name, grades);

            counter++;
        }

        // ************************************************************ */

        // b.Remove an existing Student
        System.out.println("\nEnter name of Student to be removed:");
        String remove_student_name = sc.nextLine();

        // Student list can be empty so check for exception
        try {
            Integer flag = students.remove(remove_student_name);
            if (flag != null) {
                System.out.println("\nRemoved Successfully.");
                System.out.println("\nStudents list After Removal:");

                for (Map.Entry<String, Integer> student : students.entrySet()) {
                    System.out.println("Name: " + student.getKey() + ", Grade: " + student.getValue());
                }

            } else
                System.out.println("Entered Name is not Available");
        }

        catch (NullPointerException e) {
            System.out.println("Students list is Empty");
        }

        // ************************************************************ */

        // c. Search a student by name and display grade
        System.out.println("\nFind Grade for Student:");
        String search_student_name = sc.nextLine();

        // Student list can be empty so check for exception
        try {
            Integer grade = students.get(search_student_name);
            if (grade != null)
                System.out.println("\nSearched Student with Grade: " + search_student_name + ", Grade: " + grade);
            else
                System.out.println("Entered Name is not Available");
        }

        catch (NullPointerException e) {
            System.out.println("Students list is Empty");
        }

        sc.close();
    }
}

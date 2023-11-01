import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Exception Handling 2 Ways:
// 1. Handle the Exception using try catch block
// 2. Declare the Excetion in the method signature using throws

class Student {
    private int roll_no;
    private String name;
    private int age;
    private String course;

    // Parmeterised Constructor
    // Method 1: Declare the Exceptions
    Student(int roll_no, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        this.roll_no = roll_no;
        this.course = course;

        char[] name_alphabets = name.toCharArray();
        for (char ch : name_alphabets) {
            if (!Character.isLetter(ch))
                throw new NameNotValidException("\nException: Name contains Invalid Characters");

            else
                this.name = name;
        }
        if (age < 15 || age > 21)

            throw new AgeNotWithinRangeException("\nException: Age is not within 15-21");
        else
            this.age = age;
    }

    // Getters and Setters
    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return this.getRoll_no() + " " + this.getName() + " " + this.getAge() + " " + this.getCourse();
    }

}

// User Defined Exception for Age Validation
class AgeNotWithinRangeException extends Exception {

    AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// User Defined Exception for Name Validation
class NameNotValidException extends Exception {

    NameNotValidException(String message) {
        super(message);
    }
}

// StudentManagementSystem
public class StudentManagementSystem {

    public static void main(String[] args) {
        // Read number of Students
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int no_of_Students = Integer.parseInt(sc.nextLine());

        Student student;
        Set<Integer> student_database = new HashSet<>();

        // Array list to store Student Information
        List<Student> student_info = new ArrayList<>();
        for (int i = 0; i < no_of_Students; i++) {
            System.out.println("Student " + (i + 1) + " Information");

            // Condition to check unique Roll Numbers
            System.out.println("Enter Roll No: ");
            int roll_no = Integer.parseInt(sc.nextLine());

            while (student_database.contains(roll_no)) {
                System.out.println("Please Enter Unique Roll No:");
                roll_no = Integer.parseInt(sc.nextLine());
            }
            student_database.add(roll_no);

            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Course: ");
            String course = sc.nextLine();

            // Method 2: Handle the Exceptions
            try {
                // Create Student object & Add to Arraylist
                student = new Student(roll_no, name, age, course);
                student_info.add(student);
            }

            // If Exception arises Student info is not added2
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
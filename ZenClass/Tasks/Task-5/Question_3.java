import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students in a class: ");
        int no_of_students = Integer.parseInt(sc.nextLine());

        // List to store student names
        List<String> student_names = new ArrayList<>();
        System.out.println("Enter names of Students in class");

        for (int i = 0; i < no_of_students; i++)
            student_names.add(sc.nextLine().toUpperCase());
        System.out.println("\nInput List: Student names in class");
        System.out.println(student_names);

        // Use stream method to convert list of students to streams
        // Use filter method to return students name that starts with 'A'
        List<String> filtered_students = student_names.stream()
                .filter(name -> name.startsWith("A")).collect(Collectors.toList());

        System.out.println("\nOutput: ");
        System.out.println("Students whose name starts with 'A' would get Chocolates from Teacher");
        System.out.println("Count: " + filtered_students.size());
        System.out.println(filtered_students);

        // Use RemoveAll method in List interface to return
        // Students who did not get chocolates
        System.out.println("\nStudents who did not get chocolates");
        student_names.removeAll(filtered_students);
        System.out.println("Count: " + student_names.size());
        System.out.println(student_names);

        sc.close();
    }
}

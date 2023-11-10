
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question_2 {
    public static void main(String[] args) {

        System.out.println("Enter number of Strings to pass to the Stream:");
        Scanner sc = new Scanner(System.in);
        int no_of_strings = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Strings: ");

        // Read Array of strings
        String[] input_strings = new String[no_of_strings];
        for (int i = 0; i < no_of_strings; i++) {
            System.out.print("String " + (i + 1) + ":");
            input_strings[i] = sc.nextLine();
        }

        // Convert input_strings array to List
        List<String> strings_List = Arrays.asList(input_strings);
        System.out.println("Question 2: Filter empty strings: ");
        System.out.println("\nInput");
        System.out.print("Input List: ");
        System.out.println(strings_List);

        // Filter method removes empty strings
        // Stream of strings using stream method
        List<String> result_string = strings_List.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Returns number of empty strings
        int no_of_empty_strings = strings_List.size() - result_string.size();
        System.out.println("\nOutput");
        System.out.println("Number of empty strings before filtering: " + no_of_empty_strings);
        System.out.print("Output Stream without Empty strings: ");

        // Output list not containing empty strings
        System.out.println(result_string);

        sc.close();

    }
}

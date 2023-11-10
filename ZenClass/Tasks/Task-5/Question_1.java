
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        System.out.println("Enter number of names to pass to the Stream:");
        Scanner sc = new Scanner(System.in);
        int no_of_names = Integer.parseInt(sc.nextLine());
        System.out.println("Enter names: ");

        // Store names in an array
        String[] input_names = new String[no_of_names];
        for (int i = 0; i < no_of_names; i++) {
            System.out.print("Name " + (i + 1) + ":");
            input_names[i] = sc.nextLine();
        }

        // Stream of String names
        Stream<String> names = Stream.of(input_names);

        System.out.println("\nQuestion 1: Map each name to UpperCase: ");
        System.out.println("Ouput: ");
        System.out.println("\nConvert Stream of Strings to Uppercase:");
        System.out.print("Input Stream: ");
        System.out.println(Arrays.toString(input_names));
        System.out.print("Output Stream: ");

        // Map method converts each string to Uppercase
        names.map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + ", "));

        sc.close();

    }
}

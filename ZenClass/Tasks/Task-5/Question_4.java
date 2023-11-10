import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth date: ");
        String date = sc.nextLine();

        // Specifies the pattern of date to be read as input
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parses the string based on the pattern to get the date
        LocalDate birthDate = LocalDate.parse(date, pattern);

        // Returns Current Date
        LocalDate currentDate = LocalDate.now();

        // Period  - between method calculates the age from birth date to current date
        Period age = Period.between(birthDate, currentDate);

        System.out.println("\nOutput: ");
        System.out.println("Your age is: "
                + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days");

        sc.close();

    }
}

import java.util.Scanner;

// Driver Code
public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Stores weekday names
        String weekday[] = { "Sunday", "Monday",
                "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday" };

        int day_position;
        System.out.println("Enter day position: ");

        // While loop - Displays an exception if the value
        // entered is incorrect And again Reads the input
        // Without unexpected termination

        while (true) {
            try {
                day_position = Integer.parseInt(sc.nextLine());
                System.out.println("Day: " + weekday[day_position]);
                break;
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Entered number is out of Range.");
                System.out.println("So, Enter correct position from 0-6:");
            }
        }
    }
}

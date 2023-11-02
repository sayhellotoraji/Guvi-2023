package ElectionCommission;

import java.util.Scanner;

// Driver Code
public class ElectionCommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Voter id");
        String voterID = sc.nextLine();

        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("Enter Age");
        int age = Integer.parseInt(sc.nextLine());

        Voter voter = null;

        // 2. Handle exception with try - catch block
        try {
            voter = new Voter(voterID, name, age);
        } catch (AgeNotAboveException e) {
            System.out.println(e.getMessage());
        }

        if (voter != null) {
            System.out.println("\nEligible Voter details: ");
            System.out.println(voter);
        }
    }
}
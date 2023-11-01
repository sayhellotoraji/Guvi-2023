
import java.util.Scanner;

class Voter {
    private String voterID;
    private String name;
    private int age;

    // Parameterised Constructor
    // 1. Declare Exception method
    Voter(String voterID, String name, int age) throws AgeNotAboveException {
        this.voterID = voterID;
        this.name = name;

        if (age < 18)
            throw new AgeNotAboveException("\nInvalid Age for Voter.");
        else
            this.age = age;
    }

    // No use of Setters
    // Getters

    public String getVoterID() {
        return voterID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getVoterID() + " " + this.getName() + " " + this.getAge();

    }
}

// User Defined Exception for Age Eligibility
class AgeNotAboveException extends Exception {

    AgeNotAboveException(String message) {
        super(message);
    }
}

// Election Commision
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
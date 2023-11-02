package ElectionCommission;

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
            throw new AgeNotAboveException("\nInvalid Age for Voter: Below 18.");
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
        return getVoterID() + " " + getName() + " " + getAge();

    }
}
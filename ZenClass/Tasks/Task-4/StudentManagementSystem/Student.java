package StudentManagementSystem;

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


        // Age Condtion
        if (age < 15 || age > 21)
            throw new AgeNotWithinRangeException("\nException: Age is not within 15-21");
        else
            this.age = age;


        // Name Condition
        char[] name_alphabets = name.toCharArray();
        for (char ch : name_alphabets) {
            if (!Character.isLetter(ch))
                throw new NameNotValidException("\nException: Name contains Invalid Characters");

            else
                this.name = name;
        }

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
        return "| Roll No: "+getRoll_no() + ", Name: " + getName() + ", Age: " + getAge() + ", Course: " + getCourse()+" | ";
    }
}
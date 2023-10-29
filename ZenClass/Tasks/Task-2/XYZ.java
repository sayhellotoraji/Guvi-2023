import java.util.Scanner;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

// Class 1: Person
class Person {
    // Encapsulation
    // Only Getter and Setter methods can access
    // private instance fields
    private String name;
    // Default Age = 18
    private int age = 18;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display Person Details
    public void displayPersonDetails(Person p) {
        System.out.println("Person Name: " + p.getName());
        System.out.println("Person Age : " + p.getAge());
    }

}

// Class 2: Product
class Product {
    private int pid;
    private double price;
    private int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // ************************************************** */
    // Getter Methods
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // ************************************************** */
    // Setter Methods
    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // ************************************************** */

    public static int highestPricedProductPID(Product[] prod) {
        int highest_price = 0;
        int no_of_products = prod.length;
        Product highestPricedProduct = null;
        for (int i = 0; i < no_of_products; i++) {
            if (prod[i].price > highest_price)
                highestPricedProduct = prod[i];
        }
        return (highestPricedProduct != null) ? (highestPricedProduct.pid) : 0;
    }

    // ************************************************** */

    public static void totalAmount(Product[] prod) {
        Double total = 0.0;
        for (int i = 0; i < prod.length; i++) {
            total += prod[i].price * prod[i].quantity;
        }

        // Total Spent On All Products
        System.out.println("c. Total Amount Spent: " + total);
    }

}

// Class 3: Account
class Account {
    private int account_no;
    private double balance;

    Account() {
        account_no = 0;
        balance = 0.0;
    }

    Account(int account_no, double balance) {
        this.account_no = account_no;
        this.balance = 0.0;
    }

    // Since Account Number is Computer Generated 
    // Getters and Setters are Not Needed for account_no

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        double balance = this.getBalance();
        this.setBalance(balance + amount);
        displayBalance();
    }

    public void withdraw(int amount) {
        double balance = this.getBalance();
        if (balance > 0 && balance >= amount) {
            this.setBalance(balance - amount);
        }
        else {
            System.out.println("Insufficient Balance: ");
        }

        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Available Balance:  " + this.getBalance());
    }
}

// Class 4: Employee
// Inheritance
// Employee class inherits from Person class
// Using super() the name & age variables are
// Passed to the Parent class from the child class
class Employee extends Person {
    private int employeeID;
    private double salary;

    // When a Person is already existing 
    // Only Employee credentials are updated
    Employee(Person person, int employeeID, double salary){
        super(person.getName(), person.getAge());
        this.employeeID = employeeID;
        this.salary = salary;
    }
    // Used when a New Employee object is created before the Person object
    Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // ************************************************** */

    // Getter Methods
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    // ************************************************** */

    // Setter Methods
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayPersonDetails(Person p) {
        super.displayPersonDetails(p);
        System.out.println("Person EmployeeID : " + this.getEmployeeID());
        System.out.println("Person Salary     : " + this.getSalary());
    }
}

// Driver Code
// Class named as mentioned in the task.
public class XYZ {
    public static void main(String[] args) {

        /**************************************************************** */

        // 1.1 Display Person Details
        System.out.println("1.1 Read Person Details");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Person name: ");
        String name = sc.nextLine();

        System.out.println("Enter Person age: ");
        int age = Integer.parseInt(sc.nextLine());

        // Person Object Creation
        Person person_1 = new Person(name, age);

        System.out.println("\n Display Person Details");
        person_1.displayPersonDetails(person_1);

        System.out.println("--------------------------------------");

        /**************************************************************** */

        // 1.2 Read Product Info & Perform Operations

        System.out.println("\n1.2 Read Product Details");
        System.out.println("a. Enter number of Products: ");
        int no_of_products = Integer.parseInt(sc.nextLine());

        // a) Array to store Products
        Product[] prod = new Product[no_of_products];

        // Enter Product infomation
        for (int i = 0; i < no_of_products; i++) {
            System.out.println("\n Enter Product: " + (i + 1) + " Details");
            System.out.println("Enter PID ->");
            int pid = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Price -> ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Quantity ->");
            int quantity = Integer.parseInt(sc.nextLine());

            // Create Product instance using Constuctor
            // And Store in the Product Array
            prod[i] = new Product(pid, price, quantity);

        }

        System.out.println("");

        // b) Find the highest Priced product's PID
        int highest_priced_pid = Product.highestPricedProductPID(prod);
        System.out.println("b. Highest Priced Product' s PID: " + highest_priced_pid);

        // c) Calculate total Amount Spent on all Products
        Product.totalAmount(prod);

        System.out.println("--------------------------------------");

        /**************************************************************** */

        // 1.3 Account - Transaction operations
        System.out.println("\n 1.3 Account Transactions");
        Random rand = new Random();
        Set<Integer> account_no_database = new HashSet<>();

        // Generate Random 9 Digit Account Number
        int account_no = rand.nextInt(1000000000);
        // Initial Balance when new Account Number is generated
        double balance = 0.0;

        // Check if Account Number is Already Present in the Set
        while (account_no_database.contains(account_no)) {
            account_no = rand.nextInt(1000000000);

        }
        // Store the Account Number in the Set - Account Database
        account_no_database.add(account_no);
        Account acc1 = new Account(account_no, 0.0);

        System.out.println("\nAccount Number: " + account_no);
        System.out.println("Initial Balance: " + balance);

        // a) Deposit Operation
        System.out.print("\n\n Amount to Deposit: ");
        int deposit_amount = Integer.parseInt(sc.nextLine());
        acc1.deposit(deposit_amount);

        // b) Withdraw Operation
        System.out.print("\n Amount to Withdraw: ");
        int withdrawal_amount = Integer.parseInt(sc.nextLine());
        acc1.withdraw(withdrawal_amount);

        // c) Balance Equiry Operation
        System.out.println("\n Balance Enquiry: ");
        acc1.displayBalance();
        System.out.println("--------------------------------------");

        /**************************************************************** */

        // 1.4 Employee Person Details
        // Add EmployeeID & Salary to the existing Person Object
        System.out.println("\n1.4 Read Employee Details");
        System.out.println("For Person: "+ person_1.getName());

        // For Person 1 add Employee ID & Salary;
        System.out.println("\nEnter Employee ID: ");
        int employeeID = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Employee Salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        
        // Employee Object Creation 
        Employee employee1 = new Employee(person_1, employeeID, salary);

        System.out.println("\n Display Employee Details");
        employee1.displayPersonDetails(employee1);

        // Scanner object closed
        sc.close();
    }
}
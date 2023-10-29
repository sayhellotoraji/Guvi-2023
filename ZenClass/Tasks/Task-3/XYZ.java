import java.util.Scanner;

interface Taxable {
    double salesTax = 7;
    double incomeTax = 10.5;

    double calcTax();
}

class Employee implements Taxable {
    private int empID;
    private String name;
    private double salary;

    Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        double salary = this.getSalary();
        // Salary after Tax deductions
        double salary_after_tax = salary - (salary * (Taxable.incomeTax / 100));
        return salary_after_tax;
    }
}

class Product implements Taxable {

    private int pid;
    private double price;
    private int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        double price = this.getPrice();
        int quantity = this.getQuantity();

        // Price after Tax for a single unit/ quantity
        double price_after_tax = price + (price * (Taxable.salesTax / 100));

        // Total Price = Price after tax * quantity
        double total_price = price_after_tax * quantity;
        return total_price;
    }
}

// Driver code - As mentioned in the Task
public class XYZ {
    public static void main(String[] args) {
        System.out.println("Taxable Interface Problem");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id: ");
        int empID = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Employee Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        // Create Employee Object
        Employee emp1 = new Employee(empID, name, salary);

        System.out.println("Salary after Tax - " + Taxable.incomeTax + "%: " + emp1.calcTax());

        System.out.println("-----------------------------------");
        /***************************************************** */

        System.out.println("\nEnter Product Id: ");
        int pid = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Product Price: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.println("Enter Product Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        // Create Product object
        Product prod1 = new Product(pid, price, quantity);

        System.out.println("Product Price after Tax- " + Taxable.salesTax + "% : " + prod1.calcTax());

        sc.close();
    }
}

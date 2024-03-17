// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating an employee object
        Employee employee = new Employee("John Doe", 1001, 50000);

        // Displaying employee details
        System.out.println("Employee Details:");
        employee.displayDetails();

        // Creating a DevOpsEngineer object
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Alice Smith", 2001, 60000, 10000);

        // Displaying DevOps engineer details
        System.out.println("\nDevOps Engineer Details:");
        devOpsEngineer.displayDetails();
    }
}

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Base Salary: $" + salary);
    }

    public double getSalary() {
        return salary;
    }
}

class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }

    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }
}

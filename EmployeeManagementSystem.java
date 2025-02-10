// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.


import java.util.*;

// Abstract Class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Interface Department
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// FullTimeEmployee Subclass
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed Salary for Full-time employees
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// PartTimeEmployee Subclass
class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
        super(employeeId, name, 0); // Base salary is not used for part-time employees
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workHours; // Salary based on work hours
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main Class to test the system
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 5000);
        emp1.assignDepartment("HR");
        employees.add(emp1);

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 20, 100);
        emp2.assignDepartment("Finance");
        employees.add(emp2);

        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("----------------------------");
        }
    }
}

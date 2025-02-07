// Superclass: Employee
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager -> ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer -> ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Programming Language: " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {
    private int duration; // Internship duration in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern -> ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Duration: " + duration + " months");
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000, 5);
        Developer developer = new Developer("Bob", 102, 70000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, 6);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}

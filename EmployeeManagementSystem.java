// Design an Employee class with the following features:
// Static:
// A static variable companyName shared by all employees.
// A static method displayTotalEmployees() to show the total number of employees.
// This:
// Use this to initialize name, id, and designation in the constructor.
// Final:
// Use a final variable id for the employee ID, which cannot be modified after assignment.
// Instanceof:
// Check if a given object is an instance of the Employee class before printing the employee details.

class Employee{
    static String companyName;
    static int totalEmployees;
    String name;
    final int id;
    String designation;
    public Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    public void displayEmployeeDetails(){
        if(this instanceof Employee){
            System.out.println("Company name is: "+companyName);
            System.out.println("Employee name is: "+name);
            System.out.println("Constant Employee id is: "+id);
            System.out.println("Employee Designation is: "+designation);
        }
    }
    public static void displayTotalEmployees(){
        System.out.println("Total number of employees are: "+totalEmployees);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");
        Employee emp3 = new Employee("Charlie Brown", 103, "HR Specialist");

        // Displaying details of each employee
        System.out.println("\n------Employee 1 details----------");
        emp1.displayEmployeeDetails();
        System.out.println("\n\n------Employee 2 details----------");
        emp2.displayEmployeeDetails();
        System.out.println("\n\n------Employee 3 details----------");
        emp3.displayEmployeeDetails();
    }
    
}

import java.util.*;
class Employee{
    private String name;
    private int id;
    private double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }
}

class EmployeeDetails{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Employ: ");
        int noOfEmploy=sc.nextInt();
        Employee[] employees=new Employee[noOfEmploy]; // array to hold Employee objects
        for(int i=0;i<noOfEmploy;i++){
            sc.nextLine();
            System.out.println("Enter the employ name of "+(i+1)+" Employ:  ");
            String employName=sc.nextLine();

            System.out.println("Enter the employ idi of "+(i+1)+" Employ: ");
            int employId=sc.nextInt();

            System.out.println("Enter the employ Salary of "+(i+1)+" Employ: ");
            double employSalary=sc.nextDouble();

            employees[i]=new Employee(employName,employId,employSalary);
        }
        // Loop to print the employee details

        for(int i=0;i<noOfEmploy;i++){
            System.out.println("Employ Details of "+(i+1)+" Employ");
            employees[i].displayDetails();
        }

    }
}
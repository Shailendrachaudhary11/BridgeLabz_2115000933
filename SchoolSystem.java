// Superclass: Person
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display general person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Abstract method to be implemented by subclasses
    public void displayRole() {
        System.out.println("General Person in School");
    }
}

// Subclass: Teacher (Extends Person)
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayRole()
    @Override
    public void displayRole() {
        System.out.println("Teacher (Subject: " + subject + ")");
    }
}

// Subclass: Student (Extends Person)
class Student extends Person {
    private int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayRole()
    @Override
    public void displayRole() {
        System.out.println("Student (Grade: " + grade + ")");
    }
}

// Subclass: Staff (Extends Person)
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overriding displayRole()
    @Override
    public void displayRole() {
        System.out.println("Staff (Department: " + department + ")");
    }
}

// Main class to demonstrate hierarchical inheritance
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating different school roles
        Teacher teacher = new Teacher("Alice Johnson", 40, "Mathematics");
        Student student = new Student("Bob Smith", 16, 10);
        Staff staff = new Staff("Charlie Brown", 35, "Administration");

        // Displaying details and roles
        teacher.displayDetails();
        teacher.displayRole();

        student.displayDetails();
        student.displayRole();

        staff.displayDetails();
        staff.displayRole();
    }
}

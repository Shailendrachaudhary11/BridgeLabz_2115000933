// Create a Student class to manage student data with the following features:
// Static:
// A static variable universityName shared across all students.
// A static method displayTotalStudents() to show the number of students enrolled.
// This:
// Use this in the constructor to initialize name, rollNumber, and grade.
// Final:
// Use a final variable rollNumber for each student that cannot be changed.
// Instanceof:
// Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

class Student{
    static String universityName;
    static int totalStudents;
    String name;
    final int rollNumber;
    char grade;
    public Student(String name, int rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;

    }
    public static void displayTotalStudents(){
        System.out.println("Total Students: "+totalStudents);
    }
    public void displayDetails(){
        if(this instanceof Student){
            System.out.println("University Name: "+universityName);
            System.out.println("Student name: "+name);
            System.out.println("Roll Number: "+rollNumber);
            System.out.println("Grade: "+grade);
        }
    }
}
public class UniversityStudentManagement {
  public static void main(String[] args) {
    Student.displayTotalStudents();
    Student student1 = new Student("Alice", 101, 'A');
    Student student2 = new Student("Bob", 102, 'B');
    Student student3 = new Student("Charlie", 103, 'C');

    // Displaying student details
    System.out.println("----------Student 1 details----------");
    student1.displayDetails();
    System.out.println("----------Student 1 details----------");
    student2.displayDetails();
    System.out.println("----------Student 1 details----------");
    student3.displayDetails();
    Student.displayTotalStudents();
  }
}

import java.sql.SQLOutput;

class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    // Constructor
    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentLinkedList {
    private Student head;
    public void addAtBegining(int rollNumber, String name, int age, char grade){
        Student newstudent=new Student(rollNumber,name,age,grade);
        newstudent.next=head;
        head=newstudent;
    }
    public void addAtEnd(int rollNumber, String name, int age, char grade){
        Student newstudent=new Student(rollNumber,name,age,grade);
        if(head==null){
            head=newstudent;
            return;
        }
        Student temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newstudent;

    }
    public void addAtPosition(int rollNumber, String name, int age, char grade,int position){
        Student newstudent=new Student(rollNumber,name,age,grade);
        if(position<=1){
            newstudent.next=head;
            head=newstudent;
            return;
        }
        Student temp=head;
        for(int i=0;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null) System.out.println("Invalid position");
        newstudent.next=temp.next;
        temp.next=newstudent;
    }
    public void deleteByRollNumber(int rollNumber){
        if(head==null){
            System.out.println("List is Emplty");
            return;
        }
        if(head.rollNumber==rollNumber){
            head=head.next;
            return;
        }
        Student temp=head;
        Student prev=null;
        while(temp!=null && temp.rollNumber!=rollNumber){
            prev=temp;
            temp=temp.next;

        }
        prev.next=temp.next;
    }
    public Student searchByRollNumber(int rollNumber){
        Student temp=head;
        while(temp!=null ){
            if(temp.rollNumber==rollNumber) return temp;
            temp=temp.next;
        }
        return null;
    }
    public void updateGrade(int rollNumber,char newGrade){
        Student temp=searchByRollNumber(rollNumber);
        temp.grade=newGrade;
    }
    public void displayAllRecords(){
        Student temp=head;
        while(temp!=null){
            System.out.println("Roll no: "+temp.rollNumber+" , Name: "+temp.name+" , Age: "+temp.age+" ,Grade: "+temp.grade);
            temp=temp.next;
        }
    }
}


public class StudentRecordManagement {
    public static void main(String[] args){
        StudentLinkedList studentList = new StudentLinkedList();;
        studentList.addAtBegining(5, "Anurag", 20, 'A');
        studentList.addAtBegining(4, "Aman", 26, 'B');
        studentList.addAtBegining(3, "shailendra", 23, 'A');
        studentList.addAtBegining(2, "neha", 26, 'C');
        studentList.addAtBegining(1, "pabhat", 21, 'A');
        System.out.println();
        studentList.displayAllRecords();
        studentList.addAtEnd(8, "Bob", 21, 'B');
        studentList.addAtPosition(7, "Charlie", 19, 'C', 2);
        System.out.println();
        studentList.displayAllRecords();
        studentList.deleteByRollNumber(4);
        System.out.println();
        studentList.displayAllRecords();
    }
}

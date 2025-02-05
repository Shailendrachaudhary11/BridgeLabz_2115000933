// Create a Patient class with the following features:
// Static:
// A static variable hospitalName shared among all patients.
// A static method getTotalPatients() to count the total patients admitted.
// This:
// Use this to initialize name, age, and ailment in the constructor.
// Final:
// Use a final variable patientID to uniquely identify each patient.
// Instanceof:
// Check if an object is an instance of the Patient class before displaying its details.



class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    
    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; 
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Alice Johnson", 30, "Flu");
        Patient patient2 = new Patient(102, "Bob Smith", 45, "Diabetes");
        Patient patient3 = new Patient(103, "Charlie Brown", 50, "Hypertension");

        System.out.println("------ Patient 1 Details ------");
        patient1.displayDetails();
        System.out.println("------ Patient 2 Details ------");
        patient2.displayDetails();
        System.out.println("------ Patient 3 Details ------");
        patient3.displayDetails();

        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}

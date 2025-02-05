// Create a Vehicle class with the following features:
// Static:
// A static variable registrationFee common for all vehicles.
// A static method updateRegistrationFee() to modify the fee.
// This:
// Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
// Final:
// Use a final variable registrationNumber to uniquely identify each vehicle.
// Instanceof:
// Check if an object belongs to the Vehicle class before displaying its registration details.

class Vehicle{
    static int registrationFee = 600;
    String ownerName;
    String vehicleType;
    final int registrationNumber;
    public Vehicle(String ownerName, String vehicleType, int registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(int newFee){
        registrationFee = newFee;
    }
    public void displayDetails(){
        if(this instanceof Vehicle){
            System.out.println("Registration Fee: "+registrationFee);
            System.out.println("Owner name: "+ownerName);
            System.out.println("Vehicle type: "+vehicleType);
            System.out.println("Registration number: "+registrationNumber);
        }
    }
}
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", 12345);
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", 67890);
        Vehicle vehicle3 = new Vehicle("Alex Brown", "Truck", 11223);

        // Displaying vehicle details
        System.out.println("-------Vehicle 1 details----------");
        vehicle1.displayDetails();
        System.out.println("-------Vehicle 2 details----------");
        vehicle2.displayDetails();
        System.out.println("-------Vehicle 3 details----------");
        vehicle3.displayDetails();
        System.out.println("\n-------Registration Fee updated---------");
        Vehicle.updateRegistrationFee(800);
        vehicle1.displayDetails();
    }
}

// Description: Design a system to manage vehicle rentals:
// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
// Add an abstract method calculateRentalCost(int days).
// Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
// Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
// Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
// Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.






import java.util.*;

// Abstract Class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car Subclass
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Applied";
    }
}

// Bike Subclass
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }
}

// Truck Subclass
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% additional charge for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Applied";
    }
}

// Main Class to test the system
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR123", 50, "CAR-INS-001");
        Bike bike = new Bike("BIKE456", 20);
        Truck truck = new Truck("TRUCK789", 100, "TRUCK-INS-002");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
                System.out.println(insurableVehicle.getInsuranceDetails());
            }
            System.out.println("----------------------------");
        }
    }
}

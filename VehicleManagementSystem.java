// Superclass: Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable (For Petrol Vehicles)
interface Refuelable {
    void refuel();
}

// Subclass: ElectricVehicle (Extends Vehicle)
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method specific to electric vehicles
    public void charge() {
        System.out.println(model + " is charging with a battery capacity of " + batteryCapacity + " kWh.");
    }
}

// Subclass: PetrolVehicle (Extends Vehicle and Implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Implementing refuel() from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelCapacity + " liters of petrol.");
    }
}

// Main class to demonstrate hybrid inheritance
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating an Electric Vehicle
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250, 100);

        // Creating a Petrol Vehicle
        PetrolVehicle ford = new PetrolVehicle("Ford Mustang", 240, 60);

        // Displaying details and specific behaviors
        tesla.displayDetails();
        tesla.charge();

        ford.displayDetails();
        ford.refuel();
    }
}

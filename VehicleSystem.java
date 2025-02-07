// Superclass: Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to be overridden
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private double cargoCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Cargo Capacity: " + cargoCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to demonstrate polymorphism
public class VehicleSystem {
    public static void main(String[] args) {
        // Creating different vehicle objects
        Vehicle[] vehicles = new Vehicle[] {
                new Car(200, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new Motorcycle(180, "Petrol", false)
        };

        // Display information for each vehicle
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}

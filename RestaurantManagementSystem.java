// Superclass: Person
class Person {
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display personal details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface: Worker (Used for hybrid inheritance)
interface Worker {
    void performDuties();
}

// Subclass: Chef (Extends Person and Implements Worker)
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implementing performDuties() from Worker
    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking " + specialty + ".");
    }
}

// Subclass: Waiter (Extends Person and Implements Worker)
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    // Constructor
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    // Implementing performDuties() from Worker
    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving " + tablesAssigned + " tables.");
    }
}

// Main class to demonstrate hybrid inheritance
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating instances of Chef and Waiter
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John Doe", 202, 5);

        // Displaying details and duties
        chef.displayDetails();
        chef.performDuties();

        waiter.displayDetails();
        waiter.performDuties();
    }
}

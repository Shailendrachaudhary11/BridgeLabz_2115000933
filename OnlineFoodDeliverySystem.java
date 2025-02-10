
import java.util.ArrayList;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

// Interface Discountable
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// VegItem Subclass
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Item";
    }
}

// NonVegItem Subclass
class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 20.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + ADDITIONAL_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg Item with additional charge";
    }
}

// Main Class to Test the System
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();

        VegItem vegBurger = new VegItem("Veg Burger", 50, 2);
        NonVegItem chickenPizza = new NonVegItem("Chicken Pizza", 200, 1);

        order.add(vegBurger);
        order.add(chickenPizza);

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println("Discount: " + discountableItem.applyDiscount());
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("----------------------------");
        }
    }
}

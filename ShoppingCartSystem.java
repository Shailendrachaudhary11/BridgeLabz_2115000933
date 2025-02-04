// Create a Product class to manage shopping cart items with the following features:
// Static:
// A static variable discount shared by all products.
// A static method updateDiscount() to modify the discount percentage.
// This:
// Use this to initialize productName, price, and quantity in the constructor.
// Final:
// Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
// Instanceof:
// Validate whether an object is an instance of the Product class before processing its details.


class Product{
    static double discount = 33;
    String productName;
    double price;
    int quantity;
    final int productID;
    public Product(String productName, double price, int quantity, int productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public static void updateDiscount(double newDiscount){
        discount = newDiscount;
    }
    public void displayDetails(){
        System.out.println("Product ID: "+productID);
        System.out.println("Product name: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Discount: "+discount);
        
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product product1 = new Product("Table", 487, 1, 103);
        Product product2 = new Product("Pen", 240, 5, 198);
        Product product3 = new Product("Perfume", 968, 2, 205);
        System.out.println("\n--------Product 1 details--------");
        product1.displayDetails();
        System.out.println("\n\n--------Product 2 details--------");
        product2.displayDetails();
        System.out.println("\n\n--------Product 3 details--------");
        product3.displayDetails();
        System.out.println("\nUpdating discount percentages: ");
        Product.updateDiscount(43);
        System.out.println("\n--------Product 1 details--------");
        product1.displayDetails();

    }
}

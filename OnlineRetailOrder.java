// Superclass: Order
class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed on " + orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking Number: " + trackingNumber + ")";
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Status: " + getOrderStatus());
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Status: " + getOrderStatus());
    }
}
public class OnlineRetailOrder {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2024-02-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2024-02-02", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2024-02-03", "TRK67890", "2024-02-05");

        order.displayOrderDetails();
        shippedOrder.displayOrderDetails();
        deliveredOrder.displayOrderDetails();
    }
}

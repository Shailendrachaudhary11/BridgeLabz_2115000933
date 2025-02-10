import java.util.ArrayList;
abstract class Product{
    private int productId;
    private String name;
    private double price;
    Product(int productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public abstract double calculateDiscount();
    public void displayDetials(){
        System.out.println("Product-Id: "+productId);
        System.out.println("Product-name: "+name);
        System.out.println("Product-price: "+price);
        System.out.println("discount: "+calculateDiscount());


    }
}
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
// electronics items
class Electronics extends Product implements Taxable{
    Electronics(int productId,String name,double price){
        super(productId,name,price);
    }
    public double calculateDiscount(){
        return getPrice()*0.10;
    }
    public double calculateTax(){
        return getPrice()*0.15;
    }
    public String getTaxDetails(){
        return "Taxs on ELectronic item: 15%";
    }

}
/// clothing
class Clothing extends Product implements Taxable{
    Clothing(int productId,String name,double price){
        super(productId,name,price);
    }
    public double calculateDiscount(){
        return getPrice()*0.20;
    }
    public double calculateTax(){
        return getPrice()*0.15;
    }
    public String getTaxDetails(){
        return "Taxs on ELectronic item: 15%";
    }

}
class Groceries extends Product implements Taxable{
    Groceries(int productId,String name,double price){
        super(productId,name,price);
    }
    public double calculateDiscount(){
        return getPrice()*0.12;
    }
    public double calculateTax(){
        return getPrice()*0.10;
    }
    public String getTaxDetails(){
        return "Taxs on ELectronic item: 15%";
    }

}
public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        Electronics e1=new Electronics(123,"fan",500);
        Clothing e2=new Clothing(13,"Pant",1200);
        Groceries e3=new Groceries(23,"Apple",50);
        products.add(e1);
        products.add(e2);
        products.add(e3);
        int i=0;
        for( Product p:products){
            System.out.println();
            System.out.println("Product No:========================== "+(i+1));
            p.displayDetials();
            double finalprice=p.getPrice()-p.calculateDiscount();
            System.out.println("Final-price: "+finalprice);
            i++;
        }
    }
}

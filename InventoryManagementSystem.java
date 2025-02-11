class Item{
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;
    Item(String itemName,int itemId,int quantity,double price){
        this.itemName=itemName;
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }
}
class Inventory{
    private Item head;
    public void addAtBegining(String itemName,int itemId,int quantity,double price){
        Item newitem=new Item(itemName, itemId, quantity, price);
        newitem.next=head;
        head=newitem;
    }
    public void addAtEnding(String itemName,int itemId,int quantity,double price){
        Item newitem=new Item(itemName, itemId, quantity, price);
        if(head==null){
            newitem.next=head;
            head=newitem;
            return;
        }
        Item temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newitem;
    }
    public void insertAtPosition(String itemName,int itemId,int quantity,double price,int position){
        Item newItem=new Item(itemName,itemId,quantity,price);
        if(position<=1){
            newItem.next=head;
            head=newItem;
            return;
        }
        Item temp=head;
        for(int i=0;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null) System.out.println("Invalid position");
        newItem.next=temp.next;
        temp.next=newItem;
    }
    public void deleteById(int itemId){
        if(head==null){
            System.out.println("List is Emplty");
            return;
        }
        if(head.itemId==itemId){
            head=head.next;
            return;
        }
        Item temp=head;
        Item prev=null;
        while(temp!=null && temp.itemId!=itemId){
            prev=temp;
            temp=temp.next;

        }
        prev.next=temp.next;
    }
    public void updateQuanityById(int itemId,int quanity){
        Item temp=head;
        while(temp!=null && temp.itemId!=itemId){
            temp=temp.next;
        }
        temp.quantity=quanity;
    }
    public void displayDeatils(){
        Item temp=head;
        while(temp!=null){
            System.out.println("ItemName: "+temp.itemName+" ,Itemid: "+temp.itemId+" ,quantity: "+temp.quantity+" and price: "+temp.price);
            temp=temp.next;
        }
    }
    public Item searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public Item searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }
    public void sortByPrice(){
        if(head==null || head.next==null) return;
        for(Item i=head;i!=null;i=i.next){
            for(Item j=i.next;j!=null;j=j.next){
                if(i.price>j.price){
                    swap(i,j);
                }
            }
        }
    }
    public void swap(Item a,Item b){
        String tempName = a.itemName;
        int tempId = a.itemId;
        int tempQuantity = a.quantity;
        double tempPrice = a.price;

        a.itemName = b.itemName;
        a.itemId = b.itemId;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemName = tempName;
        b.itemId = tempId;
        b.quantity = tempQuantity;
        b.price = tempPrice;
    }
    public double calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        return totalValue;
    }
}
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory itemList=new Inventory();
        itemList.addAtBegining("Fan",3432,2,1200);
        itemList.addAtBegining("Color",789,2,12000);
        itemList.addAtBegining("AC",3123,1,25000);
        itemList.displayDeatils();
        System.out.println();
        itemList.addAtEnding("Heater",7978,2,2000);
        itemList.displayDeatils();
       itemList.insertAtPosition("bottle",111,1,100,2);
        System.out.println();
        itemList.displayDeatils();
        itemList.deleteById(789);
        System.out.println();
        itemList.displayDeatils();
        itemList.updateQuanityById(111,10);
        System.out.println();
        itemList.displayDeatils();
        itemList.sortByPrice();
        System.out.println();
        itemList.displayDeatils();
    }
}

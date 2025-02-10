import java.util.ArrayList;
// Abstract Class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

// Interface Reservable
interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}

// Book Subclass
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration
    }

    @Override
    public boolean reserveItem() {
        return true; // Book can be reserved
    }

    @Override
    public boolean checkAvailability() {
        return true; // Assuming book is available
    }
}

// Magazine Subclass
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration
    }
}

// DVD Subclass
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days loan duration
    }

    @Override
    public boolean reserveItem() {
        return true; // DVDs can be reserved
    }

    @Override
    public boolean checkAvailability() {
        return true; // Assuming DVD is available
    }
}

// Main Class to Test the System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        Book book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Magazine magazine = new Magazine("M001", "National Geographic", "Various");
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Reservable: " + reservableItem.reserveItem());
                System.out.println("Availability: " + reservableItem.checkAvailability());
            }
            System.out.println("----------------------------");
        }
    }
}

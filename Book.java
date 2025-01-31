
class Book {

    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a new Book object
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 15.99);


        book1.displayBookDetails();
    }
}

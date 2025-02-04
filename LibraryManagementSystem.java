// Create a Book class to manage library books with the following features:
// Static:
// A static variable libraryName shared across all books.
// A static method displayLibraryName() to print the library name.
// This:
// Use this to initialize title, author, and isbn in the constructor.
// Final:
// Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
// Instanceof:
// Verify if an object is an instance of the Book class before displaying its details.



class Book{
    static String libraryName = "Lolopolo Library";
    String title;
    String author;
    final int isbn;
    public Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName(){
        System.out.println("Library name is: "+libraryName);
    }
    public void displayDetails(){
        if(this instanceof Book){
            System.out.println("Library Name is: "+libraryName);
            System.out.println("Title of the book is: "+title);
            System.out.println("Author of the book is: "+author);
            System.out.println("The ISBN number is: "+isbn);
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 123456);
        Book book2 = new Book("1984", "George Orwell", 789012);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 345678);
        // Displaying details of each book
        System.out.println("\n---------First Book------------");
        book1.displayDetails();
        System.out.println("\n\n---------Second Book------------");
        book2.displayDetails();
        System.out.println("\n\n---------Third Book------------");
        book3.displayDetails();
    }
}

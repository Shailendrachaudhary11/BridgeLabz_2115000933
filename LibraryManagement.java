// Superclass: Book
class Book {
    protected String title;
    protected int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title + ", Publication Year: " + publicationYear);
    }
}
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title + ", Publication Year: " + publicationYear);
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book book=new Book("Comuter Science",2003);
        Author author = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist known for depicting the Jazz Age.");
        book.displayInfo();
        author.displayInfo();
    }
}

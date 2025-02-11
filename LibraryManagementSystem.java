import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    Book prev, next;

    public Book(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}

class LibraryManagement {
    private Book head, tail;
    private int bookCount = 0;

    // Add a book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
    }

    // Add a book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    // Add a book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        if (position <= 0) {
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }

        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        Book temp = head;

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            addBookAtEnd(title, author, genre, bookID, isAvailable);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            if (newBook.next == null) {
                tail = newBook;
            }
        }
        bookCount++;
    }

    // Remove a book by Book ID
    public void removeBookByID(int bookID) {
        Book temp = head;

        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }

        if (temp == head) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp == tail) {
            tail = temp.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        bookCount--;
        System.out.println("Book with ID " + bookID + " removed successfully.");
    }

    // Search a book by Title
    public void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + temp.title + " by " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    // Search a book by Author
    public void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book Found: " + temp.title + " | Genre: " + temp.genre + " | ID: " + temp.bookID + " | Available: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found for author: " + author);
        }
    }

    // Update book availability status
    public void updateAvailability(int bookID, boolean newStatus) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = newStatus;
                System.out.println("Availability of book ID " + bookID + " updated to " + (newStatus ? "Available" : "Unavailable"));
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    // Display all books (Forward order)
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }

        Book temp = head;
        System.out.println("Books in Forward Order:");
        while (temp != null) {
            System.out.println(temp.bookID + " - " + temp.title + " by " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display all books (Reverse order)
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books in the library.");
            return;
        }

        Book temp = tail;
        System.out.println("Books in Reverse Order:");
        while (temp != null) {
            System.out.println(temp.bookID + " - " + temp.title + " by " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count the total number of books
    public int countBooks() {
        return bookCount;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Search Book by Author");
            System.out.println("7. Update Book Availability");
            System.out.println("8. Display Books (Forward)");
            System.out.println("9. Display Books (Reverse)");
            System.out.println("10. Count Total Books");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1, 2, 3:
                    System.out.print("Enter Title, Author, Genre, Book ID, Availability (true/false): ");
                    String title = scanner.next();
                    String author = scanner.next();
                    String genre = scanner.next();
                    int bookID = scanner.nextInt();
                    boolean availability = scanner.nextBoolean();
                    if (choice == 1) library.addBookAtBeginning(title, author, genre, bookID, availability);
                    else if (choice == 2) library.addBookAtEnd(title, author, genre, bookID, availability);
                    else {
                        System.out.print("Enter Position: ");
                        int position = scanner.nextInt();
                        library.addBookAtPosition(title, author, genre, bookID, availability, position);
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to Remove: ");
                    library.removeBookByID(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Book Title: ");
                    library.searchByTitle(scanner.next());
                    break;
                case 6:
                    System.out.print("Enter Author's Name: ");
                    library.searchByAuthor(scanner.next());
                    break;
                case 7:
                    System.out.print("Enter Book ID and New Availability (true/false): ");
                    library.updateAvailability(scanner.nextInt(), scanner.nextBoolean());
                    break;
                case 8 :
                    library.displayBooksForward();
                case 9 :
                    library.displayBooksReverse();
                case 10 :
                    System.out.println("Total Books: " + library.countBooks());
                case 11 :
                { scanner.close(); return; }
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

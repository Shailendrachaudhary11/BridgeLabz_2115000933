class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;
    private int ticketCount = 0;

    // Add a new ticket at the end of the circular list
    public void bookTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newTicket;
            tail = newTicket;
            tail.next = head; // Circular connection
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; // Circular link
        }

        ticketCount++;
        System.out.println("Ticket booked successfully! Ticket ID: " + ticketID);
    }

    // Remove a ticket by Ticket ID
    public void cancelTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to cancel.");
            return;
        }

        Ticket current = head;
        Ticket previous = null;

        do {
            if (current.ticketID == ticketID) {
                if (current == head && current == tail) { // Only one ticket exists
                    head = null;
                    tail = null;
                } else if (current == head) { // Remove head
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) { // Remove tail
                    previous.next = head;
                    tail = previous;
                } else { // Remove in between
                    previous.next = current.next;
                }
                ticketCount--;
                System.out.println("Ticket " + ticketID + " cancelled successfully.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket ID not found.");
    }

    // Display all booked tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        Ticket current = head;
        System.out.println("\nBooked Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketID +
                    ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName +
                    ", Seat: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name
    public void searchByCustomer(String customerName) {
        if (head == null) {
            System.out.println("No tickets found.");
            return;
        }

        Ticket current = head;
        boolean found = false;
        System.out.println("\nTickets for Customer: " + customerName);
        do {
            if (current.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket ID: " + current.ticketID +
                        ", Movie: " + current.movieName +
                        ", Seat: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for customer: " + customerName);
        }
    }

    // Search for a ticket by Movie Name
    public void searchByMovie(String movieName) {
        if (head == null) {
            System.out.println("No tickets found.");
            return;
        }

        Ticket current = head;
        boolean found = false;
        System.out.println("\nTickets for Movie: " + movieName);
        do {
            if (current.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket ID: " + current.ticketID +
                        ", Customer: " + current.customerName +
                        ", Seat: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for movie: " + movieName);
        }
    }

    // Calculate total number of booked tickets
    public void getTotalTickets() {
        System.out.println("\nTotal tickets booked: " + ticketCount);
    }
}

public class TicketBookingApp {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Booking tickets
        system.bookTicket(101, "Alice", "Avengers", "A1", "10:30 AM");
        system.bookTicket(102, "Bob", "Avengers", "A2", "10:30 AM");
        system.bookTicket(103, "Charlie", "Inception", "B1", "1:00 PM");
        system.bookTicket(104, "David", "Titanic", "C3", "3:00 PM");

        // Display all booked tickets
        system.displayTickets();

        // Search for tickets by customer name
        system.searchByCustomer("Alice");

        // Search for tickets by movie name
        system.searchByMovie("Avengers");

        // Total number of booked tickets
        system.getTotalTickets();

        // Cancel a ticket
        system.cancelTicket(102);
        system.displayTickets();
        system.getTotalTickets();
    }
}

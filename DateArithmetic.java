import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate newDate = date.plusDays(7)    // Add 7 days
                .plusMonths(1)  // Add 1 month
                .plusYears(2);  // Add 2 years
        newDate = newDate.minusWeeks(3);

        System.out.println("New date after arithmetic: " + newDate);

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        int low = 1;
        int high = 100;
        int computerGuess;
        String userFeedback;

        do {
            computerGuess = generateGuess(low, high);
            System.out.println("Is your number " + computerGuess + "?");
            System.out.println("Enter 'high', 'low', or 'correct':");
            userFeedback = scanner.nextLine().toLowerCase();

            if (userFeedback.equals("high")) {
                high = computerGuess - 1;
            } else if (userFeedback.equals("low")) {
                low = computerGuess + 1;
            }

        } while (!userFeedback.equals("correct"));

        System.out.println("Yay! I guessed your number correctly!");
        scanner.close();
    }
    private static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
}
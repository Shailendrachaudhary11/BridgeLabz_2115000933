import java.util.Scanner;

public class FactorialCalculator {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        return scanner.nextInt();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * calculateFactorial(n - 1);
    }
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
            int number = getInput();
            long factorial = calculateFactorial(number);
            displayResult(number, factorial);

    }
}
import java.util.Scanner;
public class Fibonacci {
    public static void printFibonacciSequence(int numTerms) {
        if (numTerms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci sequence up to " + numTerms + " terms:");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = scanner.nextInt();
        printFibonacciSequence(numTerms);
        scanner.close();
    }
}
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n (the number of natural numbers): ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sum = findSumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}

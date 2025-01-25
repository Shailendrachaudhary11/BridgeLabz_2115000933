import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = scanner.nextDouble();

            if (number <= 0 || index == 10) {
                break;
            }
            numbers[index] = number;
            index++;
        }

        System.out.println("\nThe numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];  // Add each number to the total
        }

        System.out.println("\nThe sum of all numbers is: " + total);
    }
}

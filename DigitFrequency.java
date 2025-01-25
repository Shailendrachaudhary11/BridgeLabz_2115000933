import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        String numStr = String.valueOf(number);
        int[] frequency = new int[10];
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';  // char '0' will give us the actual digit value

            frequency[digit]++;
        }
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }
        scanner.close();
    }
}

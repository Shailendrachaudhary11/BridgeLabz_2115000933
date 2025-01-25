import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a valid natural number greater than 0.");
            return; }
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If the number is even, store it in the even array
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // If the number is odd, store it in the odd array
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Display the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}

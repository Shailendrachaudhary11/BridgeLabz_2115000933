import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find multiplication tables for 6 to 9: ");
        int number = scanner.nextInt();


        int[][] multiplicationResult = new int[4][10];
        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                multiplicationResult[i - 6][j - 1] = number * i * j;  // Store result in the array
            }
        }
        for (int i = 6; i <= 9; i++) {
            System.out.println("\nMultiplication table of " + i + ":");
            for (int j = 0; j < 9; j++) {
                System.out.println(number + " * " + i + " * " + (j + 1) + " = " + multiplicationResult[i - 6][j]);
            }
        }
    }
}

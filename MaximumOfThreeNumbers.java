import java.util.Scanner;
public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }
    private static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
    private static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}
import java.util.Scanner;
public class GCDandLCMCalculator {
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }
    public static int calculateGCD(int a, int b) {
        int res=Math.min(a,b);

        while (res!= 0) {
            if(a%res==0 && b%res==0) break;
            res--;
        }
        return res;
    }
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static void main(String[] args) {
        int[] numbers = getInput();
        int num1 = numbers[0];
        int num2 = numbers[1];
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);
        displayResults(num1, num2, gcd, lcm);
    }
}
import java.util.Scanner;

public class Power_Cal{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

    }
}

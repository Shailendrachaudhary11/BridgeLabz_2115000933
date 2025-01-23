import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factors:");
        int numFactors = sc.nextInt();
        System.out.println("Factors:");
        for (int i = 1; i <= numFactors; i++) {
            if (numFactors % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

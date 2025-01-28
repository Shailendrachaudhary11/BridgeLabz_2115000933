import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int arr[] = new int[2];
        int quotient = number/divisor;
        int remainder = number % divisor;
        arr[0] = quotient;
        arr[1] = remainder;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:::");
        System.out.println("Enter number 1");
        int number  = sc.nextInt();
        System.out.println("Enter number 2");
        int divisor = sc.nextInt();
        int ans[] = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: "+ans[0]+"\nRemainder: "+ans[1]);
        sc.close();
    }
}
import java.util.Scanner;
public class SmallestLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = 0;
        int largest = 0;
        int ans[] = new int[2];if(number1>number2 && number1>number3) largest = number1;
        else if(number2>number1 && number2>number3) largest = number2;
        else largest = number3;
        if (number1 <= number2 && number1 <= number3) smallest = number1;
        else if (number2 <= number1 && number2 <= number3) smallest = number2;
        else smallest = number3;
        ans[0] = smallest;
        ans[1] = largest;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers::::");
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter third number");
        int number3 = sc.nextInt();
        int ans[] = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number among 3 is: "+ans[0]+" and the largest is: "+ans[1]);
        sc.close();
    }
}
import java.util.Scanner;

public class SumRecursion {
    // Recursive method to find the sum
    public static int calculateSum(int n, int sum){
        if(n==0){
            return sum;
        }
        return calculateSum(n-1, sum+n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int number = sc.nextInt();
        if(number<1){
            System.exit(0);
        }
        int sum = 0;
        int sumUsingRecursion = calculateSum(number,sum);
        System.out.println(sumUsingRecursion);
        int sumUsingFormulae = (number*(number+1))/2;
        System.out.println("The sum using recursion: "+sumUsingRecursion);
        System.out.println("The sum using formulae: "+sumUsingFormulae);
        sc.close();
    }
}
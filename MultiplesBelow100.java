import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its multiples below 100:");
        int multipleNum = sc.nextInt();
        System.out.println("Multiples below 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % multipleNum == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

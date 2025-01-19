import java.util.Scanner;

class Simple_Interest{
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the principal amount: ");
                double principal = sc.nextDouble();
                System.out.print("Enter the rate of interest (in percentage): ");
                double rate = sc.nextDouble();

                System.out.print("Enter the time period (in years): ");
                double time = sc.nextDouble();

                double simpleInterest = (principal * rate * time) / 100;

                System.out.println("The Simple Interest is: " + simpleInterest);




    }
}
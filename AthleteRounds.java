import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        double requiredDistance = 5000; // 5 km in meters

        double perimeter = side1 + side2 + side3;

        double rounds = requiredDistance / perimeter;

        rounds = Math.ceil(rounds);

        System.out.println("The total number of rounds the athlete will run is " + (int)rounds + " to complete 5 km.");

        scanner.close();
    }
}

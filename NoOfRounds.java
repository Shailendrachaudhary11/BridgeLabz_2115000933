import java.util.Scanner;
public class NoOfRounds {
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }
    public static int calculateRounds(double perimeter) {
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance / perimeter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();
        double perimeter = calculatePerimeter(side1, side2, side3);
        int rounds = calculateRounds(perimeter);
        System.out.println("The athlete complete " + rounds + " rounds to run 5 km.");
    }
}

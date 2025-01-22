import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking inputs for travel details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter starting city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter destination city: ");
        String toCity = sc.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToViaDistance = sc.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalDistance = sc.nextDouble();
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in hours): ");
        double fromToViaTime = sc.nextDouble();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in hours): ");
        double viaToFinalTime = sc.nextDouble();
        // Calculating total distance and time
        double totalDistance = fromToViaDistance + viaToFinalDistance;
        double totalTime = fromToViaTime + viaToFinalTime;
        // Displaying the results
        System.out.println("\nTravel Summary:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime + " hours");
        sc.close();
    }
}

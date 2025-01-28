import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371*km;
        return km2miles;
    }
    public static double convertMilesToKm(double miles){
        double miles2Km = 1.60934*miles;
        return miles2Km;
    }
    public static double convertMetersToFeet(double meters){
        double metres2Feet = 3.28084 * meters;
        return metres2Feet;
    }
    public static double convertFeetToMeters(double feet){
        double feet2Meters = 0.3048 * feet;
        return feet2Meters;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distanace in km");
        double km = sc.nextDouble();
        System.out.println("Enter the distance in meters");
        double meters = sc.nextDouble();
        System.out.println("The distance in km is: "+km);
        double kmToMiles = convertKmToMiles(km);
        System.out.println("The distance in Miles is: "+kmToMiles);
        double milesToKm = convertKmToMiles(kmToMiles);
        System.out.println("The distance in km again is: "+milesToKm);
        double metersToFeet = convertMetersToFeet(meters);
        System.out.println("The distance in meters is: "+meters);
        System.out.println("The distance in feet is: "+metersToFeet);
        double feetToMeters = convertFeetToMeters(metersToFeet);
        System.out.println("The distance in meters again is: "+feetToMeters);
        sc.close();

    }
}
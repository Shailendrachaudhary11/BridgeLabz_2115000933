import java.util.Scanner;

public class Volume_Cylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);


    }
}

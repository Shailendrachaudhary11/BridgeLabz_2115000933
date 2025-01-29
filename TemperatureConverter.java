import java.util.Scanner;
public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert from (Fahrenheit or Celsius): ");
        String scale = scanner.next().toLowerCase();

        if (scale.equals("fahrenheit")) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(temp + " Fahrenheit is " + celsius + " Celsius.");
        } else if (scale.equals("celsius")) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(temp + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid scale.");
        }

        scanner.close();
    }
}

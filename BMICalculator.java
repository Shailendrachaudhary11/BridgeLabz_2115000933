import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            weight[i] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (in meters): ");
            height[i] = scanner.nextDouble();
        }
        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            statuses[i] = determineStatus(data[i][2]);
        }
        System.out.println("\nDetails of Team Members:");
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + statuses[i]);
        }
        sc.close();
    }
}
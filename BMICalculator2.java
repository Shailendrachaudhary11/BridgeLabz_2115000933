import java.util.Scanner;
public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        double[][] personData=new double[number][3];
        String[] weightStatus=new String[number];
        for(int i=0;i<number;i++){
            do{
                System.out.println("Enter the weight of "+(i+1)+" person: ");
                personData[i][0]=sc.nextDouble();
                if(personData[i][0]<=0){
                    System.out.println("Enter the positive weight");
                }
            }
            while(personData[i][0]<=0);
            do {
                System.out.println("Enter the height of " + (i + 1) + " person: ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Enter valid height");
                }
            }
                while(personData[i][1]<=0);
        }
        for(int i=0;i<number;i++){
            personData[i][2]=personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        }
    }


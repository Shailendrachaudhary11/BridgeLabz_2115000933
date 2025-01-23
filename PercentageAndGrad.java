import java.util.Scanner;
public class PercentageAndGrad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in physics");
        int physics = sc.nextInt();
        System.out.println("Enter the marks in Chemistry");
        int chemistry = sc.nextInt();
        System.out.println("Enter the marks in Maths");
        int maths = sc.nextInt();
        int totalMarks = (physics + chemistry +maths);
        double percentage = (double ) (physics + chemistry +maths) / 3;
        if(percentage>=80){
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Marks: %.2f\n", percentage);
            System.out.println("Grade: A" );
            System.out.println("Remarks: above agency-normalized standards");

        }
        if(percentage>=70 && percentage<=79){
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Marks: %.2f\n", percentage);
            System.out.println("Grade: B" );
            System.out.println("Remarks: at agency-normalized standards");
        }
        if(percentage>=60 && percentage<=69){
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Marks: %.2f\n", percentage);
            System.out.println("Grade: C" );
            System.out.println("Remarks: below, but approaching agency-normalized standards");
        }
        if(percentage>=50 && percentage<=59){
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Marks: %.2f\n", percentage);
            System.out.println("Grade: D" );
            System.out.println("Remarks: well below agency-normalized standards");
        }

        if(percentage>=40 && percentage<=49){
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Marks: %.2f\n", percentage);
            System.out.println("Grade: E" );
            System.out.println("Remarks: too below agency-normalized standards");
        }
        if(percentage<=39){
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Marks: %.2f\n", percentage);
            System.out.println("Grade: R" );
            System.out.println("Remarks: Remedial standards");
        }
        sc.close();
    }
}

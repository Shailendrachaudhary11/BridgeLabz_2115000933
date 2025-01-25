import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            do {
                System.out.print("Physics marks (out of 100): ");
                marks[i][0] = scanner.nextInt();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);

            do {
                System.out.print("Chemistry marks (out of 100): ");
                marks[i][1] = scanner.nextInt();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            do {
                System.out.print("Maths marks (out of 100): ");
                marks[i][2] = scanner.nextInt();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            }
            else if (percentages[i] >= 40) {
                grades[i] = "E";
            }else {
                grades[i] = "R";  // Failed grade
            }
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}

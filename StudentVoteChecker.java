import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        StudentVoteChecker svc = new StudentVoteChecker();
        int[] ages = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            boolean canVote = svc.canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " can vote: " + canVote);
        }
    }
}
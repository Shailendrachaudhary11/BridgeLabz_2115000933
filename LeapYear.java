import java.util.Scanner;
public class LeapYear {
    public static boolean checkLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year:");
        int year = sc.nextInt();
        boolean leapYear = checkLeapYear(year);
        System.out.println("Is the entered year a Leap Year? "+leapYear);
        sc.close();
    }
}
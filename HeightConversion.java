import java.util.Scanner;
class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        int heightCm = input.nextInt();
        int heightFeet = (int) (heightCm / 30.48);
        double heightInches = (heightCm % 30.48) / 2.54;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);
        input.close();
    }
}

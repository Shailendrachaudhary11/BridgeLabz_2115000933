import java.util.Scanner;
public class Handshakes {

    public static int calculateHandshakes(int n) {
        // Using the combination formula to calculate the number of handshakes
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.printf("The maximum number of handshakes among %d students is: %d%n", n, handshakes);

    }
}

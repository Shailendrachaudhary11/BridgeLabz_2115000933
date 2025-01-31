import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        System.out.println("Toggled case string: " + result.toString());
    }
}

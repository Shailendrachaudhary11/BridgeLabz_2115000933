import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] frequency = new int[256];

        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        char mostFrequentChar = input.charAt(0);
        int maxCount = frequency[mostFrequentChar];

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (frequency[currentChar] > maxCount) {
                mostFrequentChar = currentChar;
                maxCount = frequency[currentChar];
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}

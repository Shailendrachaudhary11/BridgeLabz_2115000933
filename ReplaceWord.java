import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter the word to be replaced:");
        String oldWord = scanner.nextLine();
        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();

        String result = sentence.replace(oldWord, newWord);

        System.out.println("Modified sentence: " + result);
    }
}

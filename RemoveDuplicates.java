import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hash = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!hash.contains(c)) {
                sb.append(c);
                hash.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example input
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("String without duplicates: " + result);
    }
}

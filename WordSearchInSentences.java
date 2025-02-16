public class WordSearchInSentences {

    public static String findFirstSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;  // Return the sentence if the word is found
            }
        }
        return "Not Found";  // Return "Not Found" if no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences1 = {
                "Hello world",
                "Java is fun",
                "I love programming"
        };
        String word1 = "Java";
        System.out.println("Test Case 1: " + findFirstSentenceWithWord(sentences1, word1));

    }
}

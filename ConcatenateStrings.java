public class ConcatenateStrings {
    public static String concatenateStrings(String[] strings) {
        // Create a new StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Iterate through each string in the array and append it to the StringBuffer
        for (String str : strings) {
            sb.append(str);
        }

        // Convert the StringBuffer to a string and return it
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example input array of strings
        String[] strings = {"Hello", " ", "World", "!", " Welcome", " to", " Java"};

        // Call the concatenateStrings method and print the result
        String result = concatenateStrings(strings);
        System.out.println("Concatenated String: " + result);
    }
}

import java.io.*;

public class FileReader {  // Renamed class to avoid conflict

    // Method using FileReader (Character Stream)
    private static void readWithFileReader(String filePath) throws IOException {
        // Using the standard java.io.FileReader
        java.io.FileReader fileReader = new java.io.FileReader(filePath);
        long startTime = System.nanoTime();

        int data;
        while ((data = fileReader.read()) != -1) {
            // Do nothing with data just reading the file
        }

        long endTime = System.nanoTime();
        fileReader.close();
        System.out.println("FileReader Time (ms): " + (endTime - startTime) / 1000000.0);
    }

    // Method using InputStreamReader (Byte Stream)
    private static void readWithInputStreamReader(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        long startTime = System.nanoTime();

        int data;
        while ((data = inputStreamReader.read()) != -1) {
            // Do nothing with data just reading the file
        }

        long endTime = System.nanoTime();
        inputStreamReader.close();
        System.out.println("InputStreamReader Time (ms): " + (endTime - startTime) / 1000000.0);
    }

    public static void compareFileReadingMethods(String filePath) throws IOException {

        System.out.println("Using FileReader:");
        readWithFileReader(filePath);

        // Using InputStreamReader
        System.out.println("Using InputStreamReader:");
        readWithInputStreamReader(filePath);

        System.out.println();
    }

    public static void main(String[] args) {
        // Path to a large file (for testing purposes, ensure this path is valid)
        String filePath = "hyy.txt";

        try {
            // Compare the time it takes to read the file using both methods
            compareFileReadingMethods(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

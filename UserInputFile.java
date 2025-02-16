import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputFile {

    public static void main(String[] args) {
        String filePath = "userInput.txt";

        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))
        ) {
            String inputLine;
            System.out.println("Enter text to write to the file (type 'exit' to finish):");

            while (true) {
                inputLine = br.readLine();

                if ("exit".equalsIgnoreCase(inputLine)) {
                    System.out.println("Exiting... All input saved to " + filePath);
                    break;
                }

                bw.write(inputLine);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file:");
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class ByteToCharacterStream {

    public static void main(String[] args) {
        String filePath = "hyy.txt";
        String charset = "UTF-8";  // Specify the charset used in the file

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), charset))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
}

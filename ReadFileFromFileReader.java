import java.io.BufferedReader;
import java.io.FileReader;
import  java.io.IOException;

public class ReadFileFromFileReader {
    public static void main(String[] args) {
        String filePath="hyy.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}

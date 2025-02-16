import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordCountInFile {
    public static void main(String[] args) {
        String filePath="hyy.txt";
        String targetWord="name";
        int count=0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words=line.split("\\s+");
               for(String word:words){
                   if(word.equalsIgnoreCase(targetWord)) count++;
               }
            }
            System.out.println("The word '" + targetWord + "' occurred " + count + " times in the file.");

        }

        catch (IOException e){
            System.out.println(e);
        }
    }
}

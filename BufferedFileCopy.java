package BridgeLabz_2115000933;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourcePath = "largeFile.txt";
        String destPath = "copiedFile.txt";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            long startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

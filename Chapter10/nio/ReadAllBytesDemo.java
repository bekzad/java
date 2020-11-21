/*
    Copies files using nio package
 */

package nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAllBytesDemo {
    public static void main(String[] args) {
        Path file = FileSystems.getDefault().getPath("nio", "Test.txt");
        Path file2 = FileSystems.getDefault().getPath("nio", "Copy.txt");

        byte[] fileArray = null;

        try {
            fileArray = Files.readAllBytes(file);
            System.out.print(fileArray);
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            if (fileArray != null) {
                Files.write(file2, fileArray);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

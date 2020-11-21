/*
    Copy using newBufferedReader and newBufferedWriter
 */

package nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewBufferedReaderDemo {
    public static void main(String[] args) {
        Charset charset = Charset.forName("US-ASCII");
        Path file = FileSystems.getDefault().getPath("nio", "Test.txt");
        Path file2 = FileSystems.getDefault().getPath("nio", "CopyByBuffer.txt");


        String line = null;

        try (BufferedReader reader = Files.newBufferedReader(file, charset);
             BufferedWriter writer = Files.newBufferedWriter(file2, charset)) {

            while ((line = reader.readLine()) != null) {
                line += "\r\n";
                writer.write(line, 0, line.length());
            }

        } catch (IOException e) {
            System.err.format("%s%n", e);
        }
    }
}
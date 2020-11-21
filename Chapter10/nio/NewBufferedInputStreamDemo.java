package nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferedInputStreamDemo {
    public static void main(String[] args) {

        Path p = Paths.get("./nio/Test.txt");
        String line;

        try (InputStream in = Files.newInputStream(p);
             BufferedReader br = new BufferedReader(new InputStreamReader(in))){

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.format("%s%n", e);
        }
    }
}

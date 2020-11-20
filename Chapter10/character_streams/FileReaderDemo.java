package character_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("SampleText.txt"))){
            do {
                s = br.readLine();
                if (s == null) break;
                System.out.println(s);
            } while (s != null);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

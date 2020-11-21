package character_streams;
/*
    Good for Line Based IO
 */

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        try (FileWriter fw = new FileWriter("sample.txt")) {

            do {
                System.out.println("Write to a file: ");
                str = br.readLine();

                if (str.equals("stop")) break;

                str = str + "\r\n";

                fw.write(str);

            } while (!str.equals("stop"));

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

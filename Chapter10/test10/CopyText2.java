package test10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText2 {
    public static void main(String[] args) {

        char ch;
        int unicode;

        if (args.length != 2) {
            System.out.println("Usage: CopyText2 From To");
            return;
        }

        try (FileReader fil = new FileReader(args[0]);
             FileWriter fw = new FileWriter(args[1])){

            do {
                unicode = fil.read();
                ch = (char) unicode;

                if (unicode == -1) break;

                if (ch == ' ') ch = '-';

                fw.write(ch);

            } while (true);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

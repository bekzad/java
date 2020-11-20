package test10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyText {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fout = null;
        int unicode;
        char character;

        if (args.length != 2) {
            System.out.println("Usage: CopyText From To");
            return;
        }

        try {
            fis = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                unicode = fis.read();
                character = (char) unicode;

                if (character == ' ') {
                    character = '-';
                }

                if (unicode != -1) fout.write(character);
            } while (unicode != -1);

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }

            try {
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}

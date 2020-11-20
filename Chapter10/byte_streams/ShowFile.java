package byte_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int unicode;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Usage: byte_streams.ShowFile File");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println(e);
            return;
        }

        try {
            do {
                unicode = fin.read();
                if (unicode != -1) System.out.print((char) unicode);
            } while (unicode != -1);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                System.out.println();
                fin.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}

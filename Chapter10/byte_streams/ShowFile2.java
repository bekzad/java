package byte_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {
        int unicode;

        // This is because we have to initialize it to be able to close
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Usage: byte_streams.ShowFile File");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                unicode = fin.read();
                if (unicode != -1) System.out.print((char) unicode);
            } while (unicode != -1);

        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            try {
                System.out.println();
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}

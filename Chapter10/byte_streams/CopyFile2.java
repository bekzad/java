/*
    Also copies a file using byte streams
    However automatically closes the file using try with resources
 */

package byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {
        int unicode;

        if (args.length != 2) {
            System.out.println("Usage: byte_streams.CopyFile First.txt Second.txt");
            return;
        }

        try (FileOutputStream fos = new FileOutputStream(args[1]);
             FileInputStream fin = new FileInputStream(args[0])) {

            do {
                unicode = fin.read();
                if (unicode != -1) fos.write(unicode);
            } while (unicode != -1);

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

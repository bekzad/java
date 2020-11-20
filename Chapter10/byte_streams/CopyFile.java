/*
    Copies a file using byte streams
    Can copy anything. CLoses the streams using finally
 */

package byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fin = null;
        int unicode;

        if (args.length != 2) {
            System.out.println("Usage: byte_streams.CopyFile First.txt Second.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1], false);
            do {
                unicode = fin.read();
                if (unicode != -1) fos.write(unicode);
            } while (unicode != -1);

        } catch(IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fin != null) fin.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}

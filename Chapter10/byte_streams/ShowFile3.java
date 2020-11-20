package byte_streams;

import java.io.FileInputStream;
import java.io.IOException;
// Try with resources

public class ShowFile3 {
    public static void main(String[] args) {
        int unicode;

        if (args.length != 1) {
            System.out.println("Usage: byte_streams.ShowFile File");
            return;
        }

        // Here you can use var type inference after JDK 10
        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                unicode = fin.read();
                if (unicode != -1) System.out.print((char) unicode);
            } while (unicode != -1);

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

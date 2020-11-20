package byte_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        if (args.length != 2) {
            System.out.println("Usage: byte_streams.CompFiles Text1 Text2");
            return;
        }

        try (var fin1 = new FileInputStream(args[0]);
            var fin2 = new FileInputStream(args[1])) {
            do {
                i = fin1.read();
                j = fin2.read();
                if (i != j) break;

            } while (i != -1 && j != -1);

            if (i != j) {
                System.out.println("Files differ");
            } else {
                System.out.println("Files are the same");
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

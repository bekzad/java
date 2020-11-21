package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateTempFile {
    public static void main(String[] args) {

        try {
            Path tempFile = Files.createTempFile(null, ".myapp");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

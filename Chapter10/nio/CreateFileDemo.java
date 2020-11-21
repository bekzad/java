package nio;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDemo {
    public static void main(String[] args) {
        Path p = Paths.get("./nio/Create.txt");

        try {
            Files.createFile(p);
        } catch (FileAlreadyExistsException e) {
            System.err.println(e);
        } catch(IOException e) {
            System.err.println(e);
        }
    }
}

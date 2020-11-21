import java.io.IOException;
import java.nio.file.*;

public class CreatePath {

    public static void main(String[] args) {
        // Creating a path object, throws exception if file already exists
        Path p1 = Paths.get("New.txt");

        // Paths.get is shorthand for
        Path p2 = FileSystems.getDefault().getPath("../New2.txt");
        Path p3 = FileSystems.getDefault().getPath(".","New3.txt");

        Path p4 = Paths.get(System.getProperty("user.home"), "Desktop/java/Path", "New4.txt");

        try {
            Files.createFile(p2);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

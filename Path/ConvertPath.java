import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertPath {
    public static void main(String[] args) {

        Path p1 = Paths.get("Retrieve.txt");

        // To convert the path to a string that can be opened through a browser
        System.out.printf("toUri: %s%n", p1.toUri());

        if (args.length > 0) {
            Path inputPath = Paths.get(args[0]);
            // Converting to an Absolute path
            System.out.printf("toAbsolutePath(): %s%n", inputPath.toAbsolutePath());

            // From absolute path we can get the parent and root
            System.out.printf("getParent(): %s, getRoot(): %s%n", inputPath.getParent(), inputPath.getRoot());
            System.out.printf("Absolute path: getParent(): %s, getRoot(): %s%n", inputPath.toAbsolutePath().getParent(),
                    inputPath.toAbsolutePath().getRoot());
        }

        // Returns an exception if no such file exists
        // Turns a relative path to an absolute
        // Any redundant elements are removed
        Path path = Paths.get("./Retrieve.txt");
        try {
            Path fp = path.toRealPath();
            System.out.printf("toRealPath: %s%n", fp);
        } catch (IOException x) {
            System.err.format("%s%n", x);
            // Logic for other sort of file error.
        }

    }
}

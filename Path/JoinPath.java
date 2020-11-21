import java.nio.file.Path;
import java.nio.file.Paths;

public class JoinPath {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/bekzad/Desktop");

        System.out.printf("resolve(java/Path/Retrieve.txt): %s%n", p1.resolve("java/Path/Retrieve.txt"));
    }
}

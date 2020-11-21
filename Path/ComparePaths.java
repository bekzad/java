import java.nio.file.Path;
import java.nio.file.Paths;

public class ComparePaths {
    public static void main(String[] args) {
        Path path = Paths.get("/home/bekzad/Desktop/java/Path/Retrieve.txt");
        Path otherPath = Paths.get("/home/bekzad/Desktop/java/Path/ComparePaths.java");
        Path beginning = Paths.get("/home/bekzad");
        Path ending = Paths.get("Retrieve.txt");

        if (path.equals(otherPath)) {
            System.out.println("Paths are equal");
        } else {
            System.out.println("Paths aren't equal");
        }

        if (path.startsWith(beginning)) {
            System.out.println("path starts with beginning");
        }

        if (path.endsWith(ending)) {
            System.out.println("path ends with ending");
        }

        for (Path name: path) {
            System.out.print(name + "/");
        }

        System.out.println();
    }
}

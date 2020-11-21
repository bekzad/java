import java.nio.file.*;

public class RetrievePath {
    public static void main(String[] args) {
        /*
            An example of an absolute path
         */
        Path path = Paths.get("/home/bekzad/Desktop/java/Path/Retrieve.txt");

        // System.out.format and System.out.printf() are the same
        System.out.format("toString: %s%n", path.toString()); // returns the full path in string
        System.out.printf("getFileName: %s%n", path.getFileName()); // returns the name of the file or the last element
        System.out.printf("getName(0): %s%n", path.getName(0)); // 0th element is the closest to the root (not root /)
        System.out.printf("getNameCount: %s%n", path.getNameCount()); // returns the number of elements in the path
        System.out.printf("subPath(0,2): %s%n", path.subpath(0, 2)); // returns the subpath from 0 to 2
        System.out.printf("getParent: %s%n", path.getParent()); // returns the full parent directory
        System.out.printf("getRoot: %s%n", path.getRoot()); // returns the root directory


        System.out.println("\n");
        /*
            An example of a relative path
         */

        Path path2 = Paths.get("Path/Retrieve.txt");

        System.out.format("toString: %s%n", path2.toString());
        System.out.printf("getFileName: %s%n", path2.getFileName());
        System.out.printf("getName(0): %s%n", path2.getName(0));
        System.out.printf("getNameCount: %s%n", path2.getNameCount());
        System.out.printf("subPath(0,2): %s%n", path2.subpath(0, 2));
        System.out.printf("getParent: %s%n", path2.getParent());
        System.out.printf("getRoot: %s%n", path2.getRoot());
    }
}

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFromPathToPath {
    public static void main(String[] args) {
        Path p1 = Paths.get("bekzad");
        Path p2 = Paths.get("sardor");

        // A path from bekzad to sardor is ../sardor
        System.out.printf("From bekzad to sardor: %s%n", p1.relativize(p2));

        // A path from sardor to bekzad is ../bekzad
        System.out.printf("From sardor to bekzad: %s%n", p2.relativize(p1));


        Path p3 = Paths.get("home/bekzad/game");
        Path p4 = Paths.get("home");

        System.out.printf("From home to game %s%n", p4.relativize(p3));
        System.out.printf("From game to home %s%n", p3.relativize(p4));
    }
}

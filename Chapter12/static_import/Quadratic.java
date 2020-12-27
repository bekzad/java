package static_import;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Quadratic {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        a = 4;
        b = 1;
        c = -3;

        // Solve 4x2 + x - 3 = 0 for x
        x1 = (-b + sqrt(pow(b, 2) - 4 * a * c)) / 2 * a;
        x2 = (-b - sqrt(pow(b, 2) - 4 * a * c)) / 2 * a;

        System.out.println(x1);
        System.out.println(x2);
    }
}

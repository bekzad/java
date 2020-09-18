/* Demonstrates recursion */

class Factorial {
    private int result;
    int fact(int n) {
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println("Result of factorial 3 is: " + f.fact(3));
        System.out.println("Result of factorial 5 is: " + f.fact(5));
        System.out.println("Result of factorial 8 is: " + f.fact(8));
    }
}

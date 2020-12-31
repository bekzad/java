package methodref1;

public class MyIntPredicates {

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        return false;
    }

    static boolean isPositive(int n) {
        if (n > 0) return true;
        return false;
    }
}

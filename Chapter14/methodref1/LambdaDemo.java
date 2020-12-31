package methodref1;

public class LambdaDemo {

    static boolean numTest(IntPredicate someLambda, int n) {
        return someLambda.test(n);
    }

    public static void main(String[] args) {

        IntPredicate isPrime = (n) -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        if (numTest(isPrime, 11)) {
            System.out.println("11 is a prime number");
        }
    }
}

package lambda3;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc smallest = (n) -> {
            int result = 1;

            // Take an absolute value
            n = n < 0 ? -n : n;

            // Find the smallest positive factor
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    result = i;
                    break;
                }
            }

            return result;
        };

        System.out.println(smallest.func(10));
        System.out.println(smallest.func(17));
    }
}

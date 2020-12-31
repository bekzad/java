package test14;

public class IntFact {
    public static void main(String[] args) {
        NumericFunc<Integer> nf = (n) -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(nf.func(5));

    }
}

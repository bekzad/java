package lambda2;

public class LambdaDemo {
    public static void main(String[] args) {

        NumericTest isFactor = (n, m) -> n % m == 0;

        NumericTest isLessThan = (n, m) -> n < m;

        NumericTest areAbsEqual = (n, m) -> (n < 0 ? -n : n ) == (m < 0 ? -m : m);

        System.out.println(isFactor.test(1, 2));

        System.out.println(isLessThan.test(1, 2));

        System.out.println(areAbsEqual.test(-5, 5));
    }
}

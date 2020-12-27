package generics3;

public class WildCard {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<>(5);
        NumericFns<Double> dOb = new NumericFns<>(-5.0);

        if (iOb.absEqual(dOb)) {
            System.out.println("Absolute values are equal");
        } else {
            System.out.println("Absolute values differ");
        }
    }
}

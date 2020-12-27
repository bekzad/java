package generics3;

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<>(5);

        System.out.println("Reciprocal: " + iOb.reciprocal());
        System.out.println("Fraction: " + iOb.fraction());

        NumericFns<Double> dOb = new NumericFns<>(5.25);

        System.out.println("Reciprocal: " + dOb.reciprocal());
        System.out.println("Fraction: " + dOb.fraction());

        // This will not compile because String is not a subclass of Number
//        NumericFns<String> str;
    }
}

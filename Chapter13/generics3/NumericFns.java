package generics3;

public class NumericFns<T extends Number> {
    T num;

    NumericFns(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // If we use T here and compare the two NumericFns objects then they both have to
    // be the same types otherwise they can't be compared
//    boolean absEqual(NumericFns<T> ob) {
//        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
//    }

    // We must use a wildcard argument to compare two different NumericFns type parameter objects
    boolean absEqual(NumericFns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }
}

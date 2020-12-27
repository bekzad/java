package generics3;

public class PairDemo {
    public static void main(String[] args) {
        // It is possible
        Pair<Integer, Integer> iOb = new Pair<>(1, 2);
        Pair<Number, Integer> iOb2 = new Pair<>(1, 2);

        // This will not work because Integer is not a subclass of Double
//        Pair<Double, Integer> iob3 = new Pair<>(1.1, 3)
    }
}

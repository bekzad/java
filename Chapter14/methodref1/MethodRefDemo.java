package methodref1;

public class MethodRefDemo {
    static boolean numTest(IntPredicate someMethod, int n) {
        return someMethod.test(n);
    }

    public static void main(String[] args) {

        if (numTest(MyIntPredicates::isPrime, 11)) {
            System.out.println("11 is a prime number");
        }

        if (numTest(MyIntPredicates::isEven, 12)) {
            System.out.println("12 is an even number");
        }

        if (numTest(MyIntPredicates::isPositive, 10)) {
            System.out.println("10 is a positive number");
        }
    }
}

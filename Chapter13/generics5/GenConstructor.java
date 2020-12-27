package generics5;
// Generic constructor without a generic class
class Summation {
    private int sum;

    <T extends Number> Summation(T arg) {
        sum = 0;

        for (int i = 0; i <= arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}

public class GenConstructor {
    public static void main(String[] args) {
        Summation i = new Summation(4.2);
        System.out.println("Summation for 4.2 is " + i.getSum());
    }
}

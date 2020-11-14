
class Rethrow {
    public static void genException() {
        int[] numer = { 1, 2, 3, 4, 5, 6, 7, 9, 10};
        int[] denom = { 1, 0, 3, 4, 0, 6, 7};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + "/" + denom[i] + " = " + numer[i]/denom[i]);
            }
            catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of bounds in Rethrow class");
                throw e;
            }
        }
    }
}

public class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException in Main!");
        }
    }
}

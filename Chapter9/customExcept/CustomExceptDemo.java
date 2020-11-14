package customExcept;

public class CustomExceptDemo {
    public static void main(String args[]) {
        int[] numer = { 1, 2, 3, 4, 5, 6, 7, 9, 10};
        int[] denom = { 1, 0, 2, 4, 0, 6, 2, 3};

        for (int i = 0; i < numer.length; i++) {
            try {
                if (numer[i] % denom[i] != 0) throw new NonIntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + "/" + denom[i] + " = " + numer[i]/denom[i]);
            }
            catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of bounds");
            }
            catch (NonIntResultException e) {
                System.out.println(e);
            }
        }
    }
}

/*
    Demonstration of multi-catch exceptions
    Exception variables inside catch are final
 */
package multicatch;

public class Multicatch {
    public static void main(String args[]) {
        int[] numer = { 1, 2, 3, 4, 5, 6, 7, 9, 10};
        int[] denom = { 1, 0, 3, 4, 0, 6, 7};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + "/" + denom[i] + " = " + numer[i]/denom[i]);
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e)  {
                System.out.println("Exception: " + e);
            }
        }

        System.out.println("After multi-catch");
    }
}

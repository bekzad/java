/*
    Nested try blocks
 */

import java.util.Arrays;

public class NestTrys {
    public static void main(String args[]) {
        int[] numer = { 1, 2, 3, 4, 5, 6, 7, 9, 10};
        int[] denom = { 1, 0, 3, 4, 0, 6, 7};

        try {
            for (int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + "/" + denom[i] + " = " + numer[i]/denom[i]);
                }
                catch (final ArithmeticException e) {
                    System.out.println("Can't divide by zero");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
            System.out.println("fatal error, program terminated");
        }
    }
}

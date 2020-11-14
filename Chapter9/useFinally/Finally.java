package useFinally;

import java.sql.SQLOutput;

class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // Arithemtic exception
                    break;
                case 1:
                    nums[4] = what; // Array index out of bounds
                    break;
                case 2:
                    return; // Return from try
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
        }
        finally {
            System.out.println("Leaving try");
        }
    }
}

public class Finally {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}

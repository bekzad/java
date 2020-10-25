
public class ShiftDemo {
    public static void main(String args[]) { 
        int value = -2;

        for (int j = 0; j < 8; j++) {
            for (long i = 2147483648l; i > 0; i /= 2) {
                if ((value & i) != 0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
            value = value << 1;
        }
        System.out.println("\n");
        value = -128;
        for (int j = 0; j < 8; j++) {
            for (long i = 2147483648l; i > 0; i /= 2) {
                if ((value & i) != 0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
            value = value >>> 1;
        }

    }   
}
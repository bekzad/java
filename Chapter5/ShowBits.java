
public class ShowBits {
    public static void main(String args[]) { 

        byte value = 103;

        // Turning a value into bits by using bitwise and operator
        // 1000 0000 & 01100111 = 0000 0000 it is 128 & 103 = 0
        // If the 8th bit of a number is equal to 1 it will print 128 again
        // However if the 8th bit is equal to 0 it will print 0

        for (int i = 128; i > 0; i /= 2) {
            if ((value & i) == i) System.out.print(1);
            else System.out.print(0);
        }

        System.out.println();

        // This is the same as before but we are comparing if it's not equal to zero
        for (int i = 128; i > 0; i /= 2) {
            if ((value & i) != 0) System.out.print(1);
            else System.out.print(0);
        }

        System.out.println();

        // Reversing the state of all the bits in value
        value = (byte) ~value;
        for (int i = 128; i > 0; i /= 2) {
            if ((value & i) != 0) System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();

        for (int i = 128; i > 0; i /= 2) {
            if ((value & i) == i) System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();
    }   
}
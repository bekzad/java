
public class ShowBits {
    public static void main(String args[]) { 

        int value = 5647789;

        for (long i = 2147483648l; i > 0; i /= 2) {
            if ((value & i) != 0) System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();

        value = ~value;
        for (long i = 2_147_483_648l; i > 0; i /= 2) {
            if ((value & i) != 0) System.out.print(1);
            else System.out.print(0);
        }
        System.out.println();
    }   
}
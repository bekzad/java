
class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }

    void show(long val) {
        var mask = 1l;

        mask <<= numbits - 1;
        
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8 == 0)) {
                System.out.print(" ");
                spacer = 0;
            } 
        }
        System.out.println();
    }
}

public class ShowBitsDemo {
    public static void main(String args[]) {
        ShowBits binary = new ShowBits(8);
        ShowBits integer = new ShowBits(32);
        ShowBits longInteger = new ShowBits(64);

        binary.show(128);
        integer.show(87987);
        longInteger.show(4758656321l);
        binary.show(112457);
    }
}
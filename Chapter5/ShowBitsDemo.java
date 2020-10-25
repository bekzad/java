
class ShowBits1 {
    int numbits;

    ShowBits1(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1l;

        mask <<= numbits - 1;
//        System.out.println(mask);
        
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
        ShowBits1 byteval = new ShowBits1(8);
        ShowBits1 integer = new ShowBits1(32);
        ShowBits1 longInteger = new ShowBits1(64);

        byteval.show(128);
        integer.show(87987);
        longInteger.show(4758656321l);
    }
}
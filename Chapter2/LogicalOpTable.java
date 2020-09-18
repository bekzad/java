
public class LogicalOpTable {
    public static void main(String args[]) {

        boolean p = true, q = true;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        int i, j;

        for (int count = 0; count < 4; count++) {
            switch(count) {
                case 0:
                    p = true; q = true;
                    break;
                case 1:
                    p = true; q = false;
                    break;
                case 2:
                    p = false; q = true;
                    break;
                case 3:
                    p = false; q = false;
                    break;
            }
            i = (p) ? 1 : 0;
            System.out.print(i + "\t");
            j = (q) ? 1 : 0;
            System.out.print(j + "\t");
            i = (p & q) ? 1 : 0;
            System.out.print(i + "\t");
            j = (p | q) ? 1 : 0;
            System.out.print(j + "\t");
            i = (p ^ q) ? 1 : 0;
            System.out.print(i + "\t");
            j = (!p) ? 1 : 0;
            System.out.println(j + "\t");
        }
    }
}
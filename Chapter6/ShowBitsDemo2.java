class LocalClassDemo {
    public static void main(String args[]) {

        class ShowBits {
            private int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;
                mask = mask << numbits - 1;

                int spacer = 0;

                for(; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) System.out.print(1);
                    else System.out.print(0);
                    spacer++;
                    if (spacer == 4) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
            }
        } // End of class ShowBits

        for (int i = 0; i < 10; i++) {
            ShowBits n = new ShowBits(8);
            System.out.print("A bit value of " + i + " is: ");
            n.show(i);
            System.out.println();
        }
    }
}
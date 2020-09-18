
public class Break2 {
    public static void main(String args[]) {

        done:
            for (int i = 1; i < 10; i++) {
            one:    {
            two:        {
            three:          {
                                System.out.println("\ni is " + i);
                                if (i == 1) break one;
                                if (i == 2) break two;
                                if (i == 3) break three;
                                if (i == 4) break done;
                            }
                            System.out.println("After block three");
                        }
                        System.out.println("After the block two");
                    }
                    System.out.println("After the block one");   
            }
        System.out.println("After for block");
    }
}
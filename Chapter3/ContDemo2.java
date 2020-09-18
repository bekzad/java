
public class ContDemo2 {
    public static void main(String args[]) {
        int j;
        outerloop:
            for (int i = 1; i< 10; i++) {
                System.out.print("\nOuter loop: " + i + ", Inner loop: ");
                for (j = 1; j < 10; j++) {
                    if (j == 5) continue outerloop;
                    System.out.print(j);
                }
            }
            System.out.println();


    }

}
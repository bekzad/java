
public class FindFac {
    public static void main(String args[]) {
        int count;
        for (int i = 2; i <= 200; i++) {
            System.out.print("\nFactors of " + i + ": ");
            count = 0;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                } 
                
                if (j >= Math.sqrt(i)) {
                    if (count < 1) {
                        break;
                    } 
                }
            }
        }
    }
}
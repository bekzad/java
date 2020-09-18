
public class Avg {
    public static void main(String args[]) {
        double var[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        double sum = 0;
        for (int i = 0; i < var.length; i++) {
            sum += var[i];
        }
        System.out.println(sum/var.length);
    }
}
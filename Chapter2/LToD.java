
public class LToD {
    public static void main(String args[]) {
        long L = 1002L;
        double D;
        D = L;
        System.out.println("The value of L: " + L + " The value of D: " + D);

        // This has to be converted explicitly otherwise it will give an error
        L = (int) D;
        System.out.println("The value of L: " + L + " The value of D: " + D);
    }
}
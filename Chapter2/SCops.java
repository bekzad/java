
public class SCops {
    public static void main(String args[]) {
        int n = 10;
        int d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }

        d = 0;
        // Short circuiting and not checking the second condition
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        } else {
            System.out.println(d + " is not a factor of " + n);
        }

        // This will give us an error because we are checking both conditions
        if (d != 0 & (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
    }
}

public class SideEffects {
    public static void main(String args[]) {
        int i = 0;

        // Short circuits the second condition and i doesn't get incremented
        if (false && (i++ < 10)) {
            System.out.println("This is not executed");
        }
        System.out.println("The value of i hasn't incremented it is: " + i);

        // Checks for both conditions that's why i is incremented
        if (false & (i++ < 10)) {
            System.out.println("This is not executed");
        }
        System.out.println("The value of i has incremented it is: " + i);
    }
}
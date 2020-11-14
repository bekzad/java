import java.util.Arrays;

public class ExcDemo1 {
    public static void main(String args[]) {
        int[] nums = new int[4];
        try {
            nums[4] = 5;
            System.out.println("This won't be displayed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Array out of bounds");

        }
        System.out.println("After the catch statement");
    }
}

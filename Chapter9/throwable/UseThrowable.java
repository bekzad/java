package throwable;

class ExcTest {
    static void genException() {
        int[] nums = new int[4];

        // Exception generated here
        nums[4] = 5;
        System.out.println("This won't be displayed");
    }
}

public class UseThrowable {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            String error = e.toString();
            System.out.println("Standard message is: ");
            System.out.println(error);

            System.out.println("\nStack Trace: ");
            e.printStackTrace();
        }
        
        System.out.println("After the catch statement");
    }
}

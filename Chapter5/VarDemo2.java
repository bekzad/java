
public class VarDemo2 {
    public static void main(String args[]) {
        for (var x = 2.5; x < 100.0; x *= 2) {
            System.out.print(x + " ");
        }
        System.out.println();

        int[] nums = {1, 2, 3, 4, 5, 6};
        for (var i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }  
}
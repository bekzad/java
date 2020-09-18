
public class MinMax2 {
    public static void main(String args[]) {
        int nums[] = {-100, 200, 100000, 21, 54, 58, 98};
        int min, max;
        min = max = nums[0];

        for (int i: nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("The min and max values are: " + min + " " + max);
    }
}
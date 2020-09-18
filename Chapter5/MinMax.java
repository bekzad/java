
public class MinMax {
    public static void main(String args[]) {
        int nums[] = {-100, 200, 100000, 21, 54, 58, 98};
        int min, max;
        min = max = nums[0];

        for (int i = 1; i < 7; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("The min and max values are: " + min + " " + max);
    }
}
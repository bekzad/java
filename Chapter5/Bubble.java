
public class Bubble {
    public static void main(String args[]) {
        int nums[] = {8, 5, 7, 4, 6, 9, 2, 3, 1, 0};
        int temp;
        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {
                if (nums[j-1] > nums[j]) {
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
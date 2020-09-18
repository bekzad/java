
public class Bubble2 {
    public static void main(String args[]) {
        int nums[] = {8, 5, 7, 4, 6, 9, 2, 3, 1, 0};
        int temp;
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
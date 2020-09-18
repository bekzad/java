
public class BubbleStr {
    public static void main(String args[]) {
        String nums[] = {
            "First",
            "Second",
            "Third",
            "Fourth",
            "Fifth"
        };
        String temp;

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (nums[j].compareTo(nums[j+1]) > 0) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }
    }
}
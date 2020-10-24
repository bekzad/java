
public class ForEach {
    public static void main(String args[]) {
        var nums = new int[3][5];
        var sum = 0;

        // Usage of normal for
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i+1)*(j+1);
            }
        }

        // Usage of for each
        for (int x[]: nums) {
            for (int y: x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        } 
        System.out.println(sum);
    }
}
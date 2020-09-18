
public class ForEach {
    public static void main(String args[]) {
        int nums[][] = new int[3][5];
        int sum =0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i+1)*(j+1);
            }
        }

        for (int x[]: nums) {
            for (int y: x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        } 
        System.out.println(sum);
    }
}
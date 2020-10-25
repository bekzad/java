package Test;

class VarArgsSum {
    public static void main(String args[]) {
        int summation = sum(1, 2, 3, 4);
        System.out.println(summation);
    }
    static int sum(int ... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

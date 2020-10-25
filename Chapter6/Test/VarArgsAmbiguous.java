package Test;

public class VarArgsAmbiguous {
    public static void main(String args[]) {
//        sum(1); // Ambiguous because of first and second
        sum(); // Ambiguous because of first and third
    }
    static int sum(int ... nums) {
        return nums.length;
    }
    static int sum(int n, int ... nums) {
        return n;
    }
    static int sum(char ... nums) {
        return nums.length;
    }
}

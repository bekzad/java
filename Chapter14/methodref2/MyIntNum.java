package methodref2;

public class MyIntNum {
    private int v;

    MyIntNum(int x) { v = x; }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        if (v % n == 0) return true;
        return false;
    }

    boolean hasCommonFactor(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && v % i == 0) {
                return true;
            }
        }
        return false;
    }
}
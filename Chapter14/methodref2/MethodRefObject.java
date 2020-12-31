package methodref2;

public class MethodRefObject {
    public static void main(String[] args) {
        MyIntNum myNum = new MyIntNum(9);
        MyIntNum myNum2 = new MyIntNum(16);

        // Method reference to isFactor on object myNum is created
        IntPredicate ip = myNum::isFactor;

        if (ip.test(6)) {
            System.out.println("6 is a factor of " + myNum.getNum());
        }

        ip = myNum2::isFactor;

        if (!ip.test(6)) {
            System.out.println("6 is not a factor of " + myNum2.getNum());
        }

        ip = myNum::hasCommonFactor;
        if (ip.test(12)) {
            System.out.println("9 and 12 have common factors");
        }
    }
}

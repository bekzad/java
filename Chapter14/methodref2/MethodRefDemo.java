package methodref2;

public class MethodRefDemo {
    public static void main(String[] args) {

        MyIntNum mv = new MyIntNum(12);
        MyIntNum mv2 = new MyIntNum(14);

        MyIntNumPredicate ip = MyIntNum::isFactor;
        MyIntNumPredicate ip2 = MyIntNum::hasCommonFactor;

        if (ip.test(mv, 3)) {
            System.out.println("3 is a factor of " + mv.getNum());
        }

        if (ip2.test(mv2, 16)) {
            System.out.println("16 has a common factor with: " + mv2.getNum());
        }

    }
}

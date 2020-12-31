package methodref2;

public class MethodRefDemo {
    public static void main(String[] args) {

        MyIntNum mv = new MyIntNum(12);

        MyIntNumPredicate ip = MyIntNum::isFactor;

        if (ip.test(mv, 3)) {
            System.out.println("3 is a factor of " + mv.getNum());
        }

    }
}

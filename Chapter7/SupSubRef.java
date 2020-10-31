// However java allows reference to reference a superclass variable
// to a subclass object

class X2 {
    int a;
    X2(int i) {
        a = i;
    }
}

class Y2 extends X2 {
    int b;
    Y2(int i, int j) {
        super(j);
        b = i;
    }
}

public class SupSubRef {
    public static void main(String args[]) {
        X2 x = new X2(2);
        X2 x2;
        Y2 y = new Y2(4, 6);

        x2 = x; // Ok both the same type
        System.out.println("x2.a: " + x2.a);

        x2 = y; // Still ok because X is a superclass of y
        System.out.println("x2.a: " + x2.a);

        x2.a = 19;

        // Cannot use b because X does not have a b member
        // So we can't use variables of subclass but we can refer to them
//        x2.b = 17;

    }
}

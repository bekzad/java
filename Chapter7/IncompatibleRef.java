// Because of strongly typed language java does not
// allow different type of reference variable to refer
// to different type of object

class X {
    int a;
    X(int i) {
        a = i;
    }
}

class Y {
    int a;
    Y(int i) {
        a = i;
    }
}

public class IncompatibleRef {
    public static void main(String args[]) {
        X x = new X(2);
        X x2;
        Y y = new Y(4);

        x2 = x; // This is ok

//        y = x; // Incompatible types it will not compile
    }
}

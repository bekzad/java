class A2 {
    int i, j;
    A2(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;
    B2(int a, int b, int c) {
        super(b, c);
        k = a;
    }
    // Signature of the method is different from the superclass
    // That's why it will only overload the method in the superclass
    // Not override it
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Overload2 {
    public static void main(String args[]) {
        B2 subObj = new B2(10, 1, 2);

        subObj.show(); // This calls in A2
        subObj.show("Some message: "); // This calls in B2
    }
}

class A1 {
    int i, j;
    A1(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B1 extends A1 {
    int k;
    B1(int a, int b, int c) {
        super(b, c);
        k = a;
    }
    // When creating the same method it will override the method in the superclass
    // Override is the same as name hiding
    void show() {
        super.show(); // This way we can use the method in the superclass
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String args[]) {
        B1 subObj = new B1(10, 1, 2);

        subObj.show();
    }
}

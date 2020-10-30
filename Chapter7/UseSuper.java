// The usage of super can act somewhat like this keyword
// But super always refers to the superclass

class A {
    int i;
}

class B extends A {
    int i; // This variable hides the variable i of superclass A

    B(int a, int b) {
        super.i = a; // It refers to i in superclass A
        i = b; // It refers to i in B
    }

    void show() {
        System.out.println("i in superclass is: " + super.i);
        System.out.println("i in subclass is: " + i);
    }
}

public class UseSuper {
    public static void main(String args[]) {
        B subObj = new B(10, 20);

        subObj.show();
    }
}

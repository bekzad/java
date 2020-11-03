package interfaces;
// Demonstration of interface extends

interface A {
    void meth1();
}

interface B extends A {
    void meth2();
}

class MyClass implements B {

    @Override
    public void meth1() {
        System.out.println("Method 1 implemented");
    }

    @Override
    public void meth2() {
        System.out.println("Method 2 implemented");
    }
}

public class IExtend {
    public static void main(String args[]) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
    }
}

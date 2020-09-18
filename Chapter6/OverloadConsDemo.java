/* This program demonstrates constructor overloading */

class MyClass1 {
    int x;
    MyClass1() {
        System.out.println("Inside MyClass()");
        this.x = 0;
    }
    MyClass1(int i) {
        System.out.println("Inside MyClass(int)");
        this.x = i;
    }
    MyClass1(double d) {
        System.out.println("Inside MyClass(double)");
        this.x = (int) d;
    }
    MyClass1(int i, int j) {
        System.out.println("Inside MyClass(int, int)");
        this.x = i * j;
    }
}
public class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass1 t1 = new MyClass1();
        MyClass1 t2 = new MyClass1(88);
        MyClass1 t3 = new MyClass1(17.4);
        MyClass1 t4 = new MyClass1(2, 3);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}

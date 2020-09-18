/* Demonstrates static */

class StaticDemo {
    int x;
    static int y;
    static int z;

    int sum() {
        return x + y;
    }
    // Static method cannot access non-static instance variables
    static int staticMeth() {
        return y / z;
    }
}

public class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("ob1.x: " + ob1.x + "ob2.x: " + ob2.x);

        // Static variables must be accessed by class reference
        StaticDemo.y = 19;
        System.out.println("StaticDemo.y is 19");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());

        StaticDemo.y = 100;
        System.out.println("StaticDemo.y is changed to 100");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());

        StaticDemo.z = 50;
        System.out.println("StaticDemo.staticMeth(): " + StaticDemo.staticMeth());
    }
}

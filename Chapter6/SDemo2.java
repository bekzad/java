/* Demonstrates the static block */

class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    /* Static block executes before constructor
    Can be useful in cases such as establishing a
    connection before it is ready to create objects */
    static {
        System.out.println("Inside a static block");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

public class SDemo2 {
    public static void main(String args[]) {
        StaticBlock obj = new StaticBlock("Inside a constructor");
        System.out.println("StaticBlock.rootOf2: " + StaticBlock.rootOf2);
        System.out.println("obj.rootOf3: " + obj.rootOf3);
    }
}

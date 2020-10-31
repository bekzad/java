// Demonstrate dynamic method dispatch
// Java chooses which method to call at runtime
// by looking at an object type
// not the type of a reference variable

class Sup {
    void who() {
        System.out.println("Method who() in sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("Method who() in sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("Method who() in sub2");
    }
}

public class DinMethDisp {
    public static void main(String args[]) {
        Sup sup = new Sup();
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();

        // Superclass reference variable
        Sup supRef;

        /* As you can see when we call supRef.who() java
         * determines which who() to call at runtime
         * by looking at the objects type that supRef refers
         * not at the class type of supRefs
         */

        supRef = sup;
        supRef.who();

        supRef = sub1;
        supRef.who();

        supRef = sub2;
        supRef.who();
    }
}

package autoboxing1;

public class AutoBox2 {

    // Parameter of this method is an object Integer
    static void m(Integer v) {
        System.out.println("m() recieved " + v);
    }

    // This method returns primitive int
    static int m2() {
        return 10;
    }

    // This method returns an Integer object
    static Integer m3() {
        return 99; // Autoboxing into an Integer object
    }

    public static void main(String[] args) {
        m(199); // Autoboxing 199 into an Integer

        Integer iOb = m2(); // m2 returns primitive and here it Autoboxes into Integer
        System.out.println(iOb);

        int i = m3(); // It recieves an Integer object and Auto Unboxes it to primitive
        System.out.println(i);

        iOb = 100; // Autoboxing
        // sqrt method needs a double so it first unboxes Integer it and then promotes it to double
        System.out.println(Math.sqrt(iOb));

    }
}

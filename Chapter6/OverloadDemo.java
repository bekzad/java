/* This program demonstrates method overloading */

class Overload {
    void ovlDemo(){
        System.out.println("No parameters");
    }
    void ovlDemo(int a) {
        System.out.println("One parameter " + a);
    }
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters " + a + " " + b);
        return a + b;
    }
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resultInt;
        double resultDouble;

        // Calls the first method
        ob.ovlDemo();
        System.out.println();

        // Calls the second method
        ob.ovlDemo(2);
        System.out.println();

        // Calls the third method
        resultInt = ob.ovlDemo(2, 3);
        System.out.println(resultInt);
        System.out.println();

        // Calls the fourth method
        resultDouble = ob.ovlDemo(2.5, 3.5);
        System.out.println(resultDouble);
        System.out.println();
    }
}
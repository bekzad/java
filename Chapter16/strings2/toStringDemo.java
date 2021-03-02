package strings2;
// Demonstration of overriding toString() method
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Demensions are: " + width + " by " +
                depth + " by " + height;
    }
}


public class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 5, 15);
        String s = "Box b: " + b; // toString is invoked in concatenation as well

        System.out.println(b);
        System.out.println(s);
    }
}

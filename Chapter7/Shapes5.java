// Demonstrating that you can send a reference to an object of a subclass
// to a superclass constructor

// A class for two dimensional objects
class TwoDShape5 {
    private double width;
    private double height;

    // Default constructor
    TwoDShape5() {
        width = 0;
        height = 0;
    }

    // Parameterized constructor
    TwoDShape5(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor with one argument
    TwoDShape5(double x) {
        this.width = this.height = x;
    }

    // Constructor that takes an object as input
    TwoDShape5(TwoDShape5 ob) {
        width = ob.width;
        height = ob.height;
    }

    // Accessor methods for width and height
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }

    public void showDim() {
        System.out.println("Width and Height are: " + width + " " + height);
    }
}

// Subclass of TwoDShape
class Triangle5 extends TwoDShape5 {
    String style;

    Triangle5() {
        super(); // Super calls the default constructor of superclass
        style = "none";
    }

    Triangle5(String style, double width, double height) {
        super(width, height); // Super calls the parameterized constructor of a superclass
        this.style = style;
    }

    Triangle5(double x) {
        super(x); // Super calls the one argument constructor of a superclass
        style = "filled";
    }

    // Constructor that takes an object
    Triangle5(Triangle5 ob) {
        /*** It can send a reference to an object of Triangle5
         * to a constructor which takes a reference to object of TwoDShape
         * However superclass cannot access to a style parameter of this object
         * ***/
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes5 {
    public static void main(String args[]) {
        Triangle5 triangle1 = new Triangle5("Filled", 9, 18);
        Triangle5 triangle2 = new Triangle5(triangle1);


        System.out.println("Triangle 1: ");
        triangle1.showStyle();
        triangle1.showDim();
        System.out.println("Area: " + triangle1.area() + "\n");

        System.out.println("Triangle 2: ");
        triangle2.showStyle();
        triangle2.showDim();
        System.out.println("Area: " + triangle2.area() + "\n");

    }
}
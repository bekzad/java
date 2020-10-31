// Demonstrate abstract class
// Abstract methods must be overridden
// They don't have the body
// Other methods don't have to be overridden

abstract class TwoDShape7 {
    private double width;
    private double height;
    private String name;

    TwoDShape7() {
        width = height = 0;
        name = "none";
    }

    TwoDShape7(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShape7(double x, String name) {
        this.width = this.height = x;
        this.name = name;
    }

    TwoDShape7(TwoDShape7 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    // These methods are not abstract so they don't have to be overridden by subclasses
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public String getName() { return name; }

    public void showDim() {
        System.out.println("Width and Height are: " + width + " " + height);
    }

    // Area method defined by TwoDShape must be overridden
    abstract double area();
}

class Triangle7 extends TwoDShape7 {
    String style;

    Triangle7() {
        super();
        style = "none";
    }

    Triangle7(String style, double width, double height) {
        super(width, height, "Triangle");
        this.style = style;
    }

    Triangle7(double x) {
        super(x, "Triangle");
        style = "filled";
    }

    Triangle7(Triangle7 ob) {
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

class Rectangle2 extends TwoDShape7 {
    // Default constructor
    Rectangle2() {
        super();
    }
    // Constructor with width and height
    Rectangle2(double width, double height) {
        super(width, height, "Rectangle");
    }
    // Constructor with width and height are the same
    Rectangle2(double x) {
        super(x, "Rectangle");
    }
    // Constructor with an object
    Rectangle2(Rectangle2 ob) {
        super(ob);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    // Area method must be overridden
    double area() {
        return getWidth() * getHeight();
    }
}

class AbsShapes {
    public static void main(String args[]) {
        // We can create a reference to an abstract class
        // However we can't create an object of an abstract class
        TwoDShape7 shapes[] = new TwoDShape7[4];

        shapes[0] = new Triangle7("outlined", 8, 4);
        shapes[1] = new Rectangle2(10);
        shapes[2] = new Rectangle2(10, 5);
        shapes[3] = new Triangle7(10);

        // We can't create an object of TwoDShape anymore because it is abstract
        // shapes[4] = new TwoDShape7(5, 10, "Generic");

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Object is: " + shapes[i].getName());
            System.out.println("Area is: " + shapes[i].area());
            System.out.println();
        }
    }
}
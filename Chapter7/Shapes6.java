// Use Dynamic method dispatch

class TwoDShape6 {
    private double width;
    private double height;
    private String name;

    TwoDShape6() {
        width = height = 0;
        name = "none";
    }

    TwoDShape6(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShape6(double x, String name) {
        this.width = this.height = x;
        this.name = name;
    }

    TwoDShape6(TwoDShape6 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public String getName() { return name; }

    public void showDim() {
        System.out.println("Width and Height are: " + width + " " + height);
    }

    // Area method defined by TwoDShape should be overridden
    double area() {
        System.out.println("This method must be overridden");
        return 0.0;
    }
}

class Triangle6 extends TwoDShape6 {
    String style;

    Triangle6() {
        super();
        style = "none";
    }

    Triangle6(String style, double width, double height) {
        super(width, height, "Triangle");
        this.style = style;
    }

    Triangle6(double x) {
        super(x, "Triangle");
        style = "filled";
    }

    Triangle6(Triangle6 ob) {
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

class Rectangle extends TwoDShape6 {
    // Default constructor
    Rectangle() {
        super();
    }
    // Constructor with width and height
    Rectangle(double width, double height) {
        super(width, height, "Rectangle");
    }
    // Constructor with width and height are the same
    Rectangle(double x) {
        super(x, "Rectangle");
    }
    // Constructor with an object
    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class Shapes6 {
    public static void main(String args[]) {
        TwoDShape6 shapes[] = new TwoDShape6[5];

        shapes[0] = new Triangle6("outlined", 8, 4);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 5);
        shapes[3] = new Triangle6(10);
        shapes[4] = new TwoDShape6(5, 10, "Generic");

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Object is: " + shapes[i].getName());
            System.out.println("Area is: " + shapes[i].area());
            System.out.println();
        }
    }
}
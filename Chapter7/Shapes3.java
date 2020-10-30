// Showing a constructor in a superclass

// A class for two dimensional objects
class TwoDShape3 {
    private double width;
    private double height;

    // Default constructor
    TwoDShape3() {
        width = 0;
        height = 0;
    }

    // Parameterized constructor
    TwoDShape3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor with one argument
    TwoDShape3(double x) {
        this.width = this.height = x;
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
class Triangle3 extends TwoDShape3 {
    String style;

    Triangle3() {
        super(); // Super calls the default constructor of superclass
        style = "none";
    }

    Triangle3(String style, double width, double height) {
        super(width, height); // Super calls the parameterized constructor of a superclass
        this.style = style;
    }

    Triangle3(double x) {
        super(x); // Super calls the one argument constructor of a superclass
        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes3 {
    public static void main(String args[]) {
        Triangle3 triangle1 = new Triangle3();
        Triangle3 triangle2 = new Triangle3("Filled", 9, 18);
        Triangle3 triangle3 = new Triangle3(4);

        // triangle1 refers to an object that triangle two refers to now
        triangle1 = triangle2;

        System.out.println("Info for object with default constructor:");
        triangle1.showStyle();
        triangle1.showDim();
        System.out.println("Area: " + triangle1.area() + "\n");

        System.out.println("Info for object with parameterized constructor:");
        triangle2.showStyle();
        triangle2.showDim();
        System.out.println("Area: " + triangle2.area() + "\n");

        System.out.println("Info for object with equal width and height constructor:");
        triangle3.showStyle();
        triangle3.showDim();
        System.out.println("Area: " + triangle3.area() + "\n");
    }
}
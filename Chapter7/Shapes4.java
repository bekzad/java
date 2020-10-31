// Multilevel hierarchy of TwoDShape -> Triangle -> ColorTriangle classes

// A class for two dimensional objects
class TwoDShape4 {
    private double width;
    private double height;

    // Default constructor
    TwoDShape4() {
        width = 0;
        height = 0;
    }

    // Parameterized constructor
    TwoDShape4(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor with one argument
    TwoDShape4(double x) {
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
class Triangle4 extends TwoDShape4 {
    String style;

    Triangle4() {
        super(); // Super calls the default constructor of superclass
        style = "none";
    }

    Triangle4(String style, double width, double height) {
        super(width, height); // Super calls the parameterized constructor of a superclass
        this.style = style;
    }

    Triangle4(double x) {
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

class ColorTriangle extends Triangle4 {
    private String color;

    ColorTriangle(String color, String style, double width, double height) {
        super(style, width, height);
        this.color = color;
    }

    // Accessor method
    public String getColor() { return color; }

    void showColor() {
        System.out.println("Color: " + color);
    }
}

class Shapes4 {
    public static void main(String args[]) {
        ColorTriangle triangle = new ColorTriangle("Red", "filled", 5, 8);

        System.out.println("Info for colorTriangle:");
        triangle.showStyle();
        triangle.showColor();
        triangle.showDim();
        System.out.println("Area: " + triangle.area());
    }
}
// Showing a constructor in a subclass

// A class for two dimensional objects
class TwoDShape2 {
    private double width;
    private double height;

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
class Triangle2 extends TwoDShape2 {
    String style;

    Triangle2(String style, double width, double height) {
        this.style = style;

        setWidth(width);
        setHeight(height);
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes2 {
    public static void main(String args[]) {
        Triangle2 triangle = new Triangle2("Outlined", 8.0, 12.0);

        triangle.showStyle();
        triangle.showDim();
        System.out.println("Area: " + triangle.area());
    }
}
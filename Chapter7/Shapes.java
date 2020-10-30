// A class for two dimensional objects
class TwoDShape {
    private double width;
    private double height;

    // Accessor methods for width and height
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }

    public void showDim() {
        System.out.println("Width and height are: " + width + " " + height);
    }
}

// Subclass of TwoDShape
class Triangle extends TwoDShape {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes {
    public static void main(String args[]) {
        Triangle triangle = new Triangle();
        triangle.setWidth(4.0);
        triangle.setHeight(8.0);
        triangle.style = "filled";

        triangle.showDim();
        triangle.showStyle();
        System.out.println("Area: " + triangle.area());
    }
}
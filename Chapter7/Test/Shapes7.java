package Test;

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

class Circle extends TwoDShape7 {
    double radius;

    Circle() {
        super();
        radius = getWidth() / 2;
    }

    Circle(double width) {
        super(width, "Circle");
        radius = width / 2;
    }

    Circle(Circle ob) {
        super(ob);
        radius = ob.radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Shapes7 {
    public static void main(String args[]) {
        Circle c = new Circle(14);
        System.out.println(c.getName());
        System.out.println(c.area());
    }
}

package Java2.shapes;

public class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        System.out.println("The area comes from the Rectangle class");
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}

package Java2.shapes;

public class Rectangle extends Quadralateral implements Measurable {

    public Rectangle(double width, double length) {
        // A Java rule: first thing on class that has a parent is to
        // call the parent constructor
        super(width, length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}

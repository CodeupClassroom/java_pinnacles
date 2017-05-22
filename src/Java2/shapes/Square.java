package Java2.shapes;

public class Square extends Quadralateral implements Measurable {
    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        length = width;
    }
}

package Java2.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(5.5, 3.0);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(3.0);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}

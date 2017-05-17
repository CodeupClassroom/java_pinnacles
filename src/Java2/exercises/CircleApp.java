package Java2.exercises;

/**
 * Created by Fer on 5/17/17.
 */
public class CircleApp {

    public static void main(String[] args) {

        Input entry = new Input();

        System.out.println("Give me the radius");
        double radius = entry.getDouble();

        Circle c = new Circle(radius);

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());

    }

}

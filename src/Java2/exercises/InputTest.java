package Java2.exercises;

/**
 * Created by Fer on 5/17/17.
 */
public class InputTest {

    public static void main(String[] args) {

        Input entry = new Input();

        System.out.println("Is today Wed?");
        System.out.println(entry.yesNo());

        int min = 1;
        int max = 10;

        System.out.println("Give me a number between "+ min +" and " + max);
        System.out.println("The number in the range was: " + entry.getInt(min, max));

        Circle c = new Circle(5);



    }

}

import java.util.Scanner;

public class Input {
    private Scanner scanner;  // this is the scanner property/attribute/field/instance variable

    // When an instance of this object is created, the scanner property should be set to a new
    // instance of the Scanner class.
    public Input() {
        scanner = new Scanner(System.in);
    }
}

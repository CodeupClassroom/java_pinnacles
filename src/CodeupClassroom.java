import java.util.Scanner;

public class CodeupClassroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("Enter the width of the classroom");
        double width = input.nextDouble();

        System.out.println("Enter the length of the classroom");
        double length = input.nextDouble();

        // process
        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        // output
        System.out.printf("The area of the classroom is %.2f%n", area);
        System.out.printf("The perimeter of the classroom is %.2f\n", perimeter);
    }
}

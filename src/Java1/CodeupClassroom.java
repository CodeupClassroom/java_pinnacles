package Java1;

import java.io.PrintStream;
import java.util.Scanner;

public class CodeupClassroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out; // Extracted a variable
        double width;
        double length;

        // input
        // promptDouble(message)
        output.println("Enter the width of the classroom");
        width = input.nextDouble();

        // promptDouble(message)
        output.println("Enter the length of the classroom");
        length = input.nextDouble();

        // process
        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        // output
        output.printf("The area of the classroom is %.2f%n", area);
        output.printf("The perimeter of the classroom is %.2f\n", perimeter);
    }
}

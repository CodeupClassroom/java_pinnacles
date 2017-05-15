import java.io.PrintStream;
import java.util.Scanner;

// Transformations
// Refactoring -> changing code, without changing the behaviour
public class Factorial {
    public static void main(String[] args) {
        // input is a number (integer)
        // factorial is the output (integer -> long)
        long number;
        long factorial;
        Scanner input = new Scanner(System.in);
        String wantsToContinue;
        PrintStream output = System.out; // extract variable

        do {
            number = getNumber(output, input);

            // there's gonna be a series of transformations
            // constant -> variable
            // variable -> if statement
            // if -> loop
            // extract method/function
            output.println(number + "! = " + calculateFactorial(number));

            output.println("Do you want to continue (y/n)?");
            // delimiter, delimiter for next is the space
            // delimiter for nextLine is the enter
            wantsToContinue = input.next();
        } while ("y".equalsIgnoreCase(wantsToContinue));
    }

    public static long calculateFactorial(long number) {
        int factorial = 1; // local variable
        for (int i = 1; i <= number; i++) { // counter
            factorial = factorial * i;  // accumulator
        }
        return factorial;
    }

    public static long  getNumber(PrintStream output, Scanner input) {
        output.println("Enter an integer number");
        //long number = input.nextLong();  //inline variable
        return input.nextLong();
    }
}

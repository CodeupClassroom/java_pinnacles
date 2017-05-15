import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // input is a number (integer)
        // factorial is the output (integer -> long)
        long number;
        long factorial;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number");
        number = input.nextLong();

        // there's gonna be a series of transformations
        // constant -> variable
        // variable -> if statement
        // if -> loop
        factorial = 1;
        for (int i = 1; i <= number; i++) { // counter
            factorial = factorial * i;  // accumulator
        }

        System.out.println(number + "! = " + factorial);
    }
}

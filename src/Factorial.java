public class Factorial {
    public static void main(String[] args) {
        // input is a number (integer)
        // factorial is the output (integer -> long)
        long number = 7;
        long factorial = 1;

        // there's gonna be a series of transformations
        // constant -> variable
        // variable -> if statement
        // if -> loop
        for (int i = 1; i <= number; i++) { // counter
            factorial = factorial * i;  // accumulator
        }

        System.out.println(number + "! = " + factorial);
    }
}

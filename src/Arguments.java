public class Arguments {
    public static void main(String[] args) {
        // Composition
        // Expression. It returns value.
        // Expressions have a type
        // input -> process -> output
        // Functions == Sub-programs
        // public static <return-type> /* output */ <method-name>(<input or parameters>) {}

        // output -> return type (void)
        // input -> parameters
        // process -> method body
        System.out.println(multiplication(2, 5));
    }

    // if b = 1 then a
    // otherwise a + a * (b - 1)
    public static long multiplication(long number1, long number2) {
        if (number2 == 1) return number1;

        else return number1 + multiplication(number1, number2 - 1);
    }
}






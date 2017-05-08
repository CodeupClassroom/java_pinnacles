public class Arithmetic {
    public static void main(String[] args) {
        double number1 = 12;
        double number2 = 6.5;

        System.out.println(number1 + number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);

        int number3 = 10;
        int number4 = 4;

        System.out.println(number3 % number4);
        System.out.println(number3 / number4);  // the division is also going to be an integer

        number3++; // 11
        number3++; // 12

        System.out.println(number3);

        number4--;  // 3
        number4--;  // 2
        System.out.println(number4);

        number4 = number4 + 5;
        number4 += 5;
        System.out.println(number4);

        // an implicit casting
        int anIntegerNumber = 23;
        double aDouble = anIntegerNumber;

        System.out.println(aDouble);


        double anotherNumber = 3.45; // the number it's larger by definition
        int aSmallerNumber = (int) anotherNumber;  // cast is explicit
        System.out.println(aSmallerNumber);


    }
}

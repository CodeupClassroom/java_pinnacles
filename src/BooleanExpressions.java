import java.util.Scanner;

public class BooleanExpressions {
    public static void main(String[] args) {
        // TYPES
        //String value = "Something";  // string expression
        //false;
        //5 > 5;
        //isGreaterThanTen() ;  // return false;
        // 6 > 7 && 7 > 10;

        //int number1 = 100;
        //int number2 = 134;

        // Short circuit
        //System.out.println(number1 > 200 || number2 > number1);

        // Albums -> New releases 12, Children 8, Greatest hits 10
        Scanner input = new Scanner(System.in);
        System.out.println("What type of album do you want to buy?");
        String type = input.nextLine();

        switch (type.toLowerCase()) {
            case "new release":  // FALLTHROUGH
                System.out.println("You'll need to pay $12.00");
                break;  // do not forget this break statement
            case "children":
                System.out.println("You'll need to pay $8.00");
                break;
            default:
                System.out.println("You'll need to pay $10.00");
        }

        if (type.equalsIgnoreCase("New release")) {
            System.out.println("You'll need to pay $12.00");
        } else if (type.equalsIgnoreCase("Children")) {
            System.out.println("You'll need to pay $8.00");
        } else {
            System.out.println("You'll need to pay $10.00");
        }
    }
}

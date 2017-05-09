import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Albums -> New releases 12, Children 8, Greatest hits 10
        // All customers can buy more than one album  (while loop)
        Scanner input = new Scanner(System.in);
        String yesNo = "Y";

        while (yesNo.equalsIgnoreCase("Y")) {
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

            System.out.println("Do you want to buy another album? (Y/N)");
            yesNo = input.nextLine();
        }
    }
}

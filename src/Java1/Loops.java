package Java1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Albums -> New releases 12, Children 8, Greatest hits 10
        // All customers can buy more than one album  (while loop)
        Scanner input = new Scanner(System.in);
        String yesNo = "Y";
        double total = 0;

        // While loop
        while (yesNo.equalsIgnoreCase("Y")) {
            System.out.println("What type of album do you want to buy?");
            String type = input.nextLine();

            switch (type.toLowerCase()) {
                case "new release":  // FALLTHROUGH
                    System.out.println("You'll need to pay $12.50");
                    total += 12.5;
                    break;  // do not forget this break statement
                case "children":
                    System.out.println("You'll need to pay $8.25");
                    total += 8.25;
                    break;
                default:
                    System.out.println("You'll need to pay $10.00");
                    total += 10;
            }

            System.out.println("Do you want to buy another album? (Y/N)");
            yesNo = input.nextLine();
        }

        System.out.println("The total is: " + total);


        // Do while
        int i = 1;

        do{
            System.out.println("Hello " + i);
            i++;
        }while(i <= 5);

        // For loop
        for(int c = 1; c <= 10 ; c++){

            // this is gonna skip number 5 and number 6
            if( c == 5 || c == 6 ){
                continue;
            }

            // The loop is gonna break at 8
            if(c == 8){
                break;
            }

            System.out.println("value of c: " + c);

        }


    }
}

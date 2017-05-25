package Java2.exercises;

import java.util.Scanner;

/**
 * Created by Fer on 5/17/17.
 */
public class Input {

    private Scanner scan;

    public Input(){
        this.scan = new Scanner(System.in);
    }

    public String getString(){
        return scan.nextLine();
    }

    public boolean yesNo(){
        String answer = this.getString();

        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        }

        return false;
    }

    public int getInt(){
        try {
            return Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.print("Please enter *an integer*: ");
            return getInt();
        }
    }

    public int getInt(int min, int max){
        int num;
        try {
            String possibleNumber = this.getString();
            num = Integer.valueOf(possibleNumber);
        } catch (NumberFormatException e) {
            System.out.print("Please enter *an integer* between " + min + " and " + max + ": ");
            return getInt(min, max);
        }

        if(num >= min && num <= max){
            return num;
        }

        System.out.println(num + " number out of range, try again");
        return getInt(min, max);

    }

    public double getDouble(){
        return scan.nextDouble();
    }

    public double getDouble(int min, int max){
        double num = this.getDouble();

        if(num >= min && num <= max){
            return num;
        }

        System.out.println(num + " number out of range, try again");
        return getDouble(min, max);

    }

    public static void main(String[] cheese) {
        Input input = new Input();
        System.out.print("Enter a a number between 20 and 30: ");
        int userInput = input.getInt(20, 30);
        System.out.println("You entered " + userInput + "!");
    }

}

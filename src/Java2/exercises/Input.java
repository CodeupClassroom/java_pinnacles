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
        return scan.nextInt();
    }

    public int getInt(int min, int max){
        int num = this.getInt();

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

}

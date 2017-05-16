package Java1;

import java.util.Scanner;

/**
 * Created by Fer on 5/11/17.
 */
public class MethodsLecture {

    public static boolean makeTacos(boolean tortillas, boolean fill, boolean salsa){

        System.out.println("Tacos with salsa");

        if(tortillas && fill && salsa){
            return true;
        }else{
            return false;
        }

    }

    public static boolean makeTacos(boolean tortillas, boolean fill){

        System.out.println("Tacos without salsa");

        if(tortillas && fill){
            return true;
        }else{
            return false;
        }

    }


    public static void areTheTacosReady(boolean answer, String client){
        if(answer){
            System.out.println("Tacos are ready!");
        }else{
            System.out.println("Tacos are NOT ready!");
        }

        System.out.println(serve(client));

    }

    public static String serve(String client){
        return client + " was notified";
    }

    public static String askClientName(Scanner input){
        System.out.println("Give me the client's name: ");
        String client = input.nextLine();
        return client;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean answerC1 = makeTacos( true, true ,true);
        String name = askClientName(input);
        areTheTacosReady(answerC1, name);

        areTheTacosReady( makeTacos(false, true), askClientName(input) );


    }


}

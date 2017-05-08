package io;

import java.util.Scanner;

/**
 * Created by Fer on 5/8/17.
 */
public class playWithIO {

    public static void main(String[] args) {

        // Creating an instance of the Class Scanner
        Scanner scan = new Scanner(System.in);

        //Declaring the var name
        String name;

        // Show a message to the user first
        System.out.println("Give me your name:");

        // This is going to ask for a String value
        name = scan.nextLine();

        // This is going to display that value
        System.out.println("Your name is: " + name);

        // More practice
        System.out.println("Give me your age:");
        int age = scan.nextInt();
        System.out.println("Your age is: "+ age);

        System.out.println("Give me your grade for JAVA: ");
        double grade = scan.nextDouble();
        System.out.println("Your grade is: " + grade);

    }

}

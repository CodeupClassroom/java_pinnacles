package Java1;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Strings are references to objects
        String defaultSchool = "Codeup";
        System.out.println("Enter the name of a school:");
        String studentSchool = scanner.next();

        // `defaultSchool.equals(studentSchool)`
        // will check for the content of both strings character by character

        // for (...) { char == anotherChar } // true if true for every character in the string
        if (defaultSchool.equals(studentSchool)) {
            System.out.println("The CONTENT of both strings is the same...");
        }

        // On the other hand
        // `defaultSchool == studentSchool` is making a DIFFERENT question
        // INSTEAD OF, is the content of the strings equal?
        // Java is answering to the question are these two strings the same?
        // Are they both pointing to the same thing in memory?
        // Are `defaultSchool` and `studentSchool` referring the to the same string in memory ?

        if (defaultSchool == studentSchool) { // are these 2 the same one in memory?
            System.out.println("Both variables point to the same string");
        }
    }
}

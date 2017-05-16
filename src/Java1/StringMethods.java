package Java1;

public class StringMethods {
    public static void main(String[] args) {
        String word = "CODE!";
        String word2 = "Codeup";
        String sentence = "Programming is great!";
        String sentence2 = "Java is great!";
        String sentence3 = "Programming requires a lot of practice!";

        if (word.startsWith("Programming")) {
            System.out.println(word + " starts with Programming");
        }
        if (sentence.startsWith("Programming")) {
            System.out.println(sentence + " starts with Programming");
        }

        if (sentence2.endsWith("great!")) {
            System.out.println(sentence2 + " ends with great!");
        }
        // Write a program that knows if a sentence is a question...
        if (sentence3.endsWith("?")) {
            System.out.println(sentence3 + " is a question...");
        }

        System.out.println(word2.toLowerCase());
        System.out.println(word2.toUpperCase());

        // Write a program that tells me if somebody is shouting
        if (word.toUpperCase().equals(word)) {
            System.out.println("why are you shouting?");
        }




        System.out.println("This is a test".charAt(1));

        System.out.println("How many characters do I have?".length());

        // sout the last character of a sentence
        String anotherSentence = "This is my sentence";
        System.out.println(anotherSentence.charAt(anotherSentence.length() - 1));

        // write some code to get the first letter 'b' from a sentence
        // Youtube for videos of Java
        System.out.println(
            "You should be coding at least 30 minutes coding everyday!".indexOf("coding")
        );
        System.out.println("this is a test".indexOf("Java"));


        System.out.println("developers, developers, developers!".lastIndexOf("developers"));

        System.out.println("Banana".replace('a', 'i'));
        System.out.println("Banana".replace("an", "il"));


        String aSentence = "Writing code is fun"; // is not fun
        System.out.println(aSentence.replace("is", "is not"));

        // if the user enters nothing, the bot should answer: why are you so quiet?
        sentence = "     ";
        if (sentence.trim().equals("")) {
            System.out.println("why are you so quiet?");
        }

        // ""
        System.out.println(" \"hello!\" ");
        System.out.println(" \\\\\" ");
    }
}

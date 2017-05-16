package Java1;

import java.util.Scanner;

/**
* Bob is a lackadaisical teenager. In conversation, his responses are very limited.
* Bob answers 'Sure.' if you ask him a question.
* He answers 'Whoa, chill out!' if you yell at him.
* He says 'Fine. Be that way!' if you address him without actually saying anything.
* He answers 'Whatever.' to anything else.
*/
public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Talk to Bob:");
        String message = input.nextLine();

        if (isAQuestion(message)) {
            System.out.println("Sure.");
        } else if (isNotResponse(message)) {
            System.out.println("Fine. Be that way!");
        } else if (isShouting(message)) {
//            "BOB 123".toUpperCase(); // same
//            "BOB 123".toLowerCase(); // different
//
//            "123".toUpperCase(); // same
//            "123".toLowerCase(); // same
//            "  ".toUpperCase(); // same
//            "  ".toLowerCase(); // same
//            "#$%".toUpperCase(); // same
//            "#$%".toLowerCase(); // same
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever.");
        }
    }

    public static boolean isAQuestion(String message) {
        return message.endsWith("?");
    }

    public static boolean isNotResponse(String message) {
        return message.trim().isEmpty();
    }

    public static boolean isShouting(String message) {
        return message.endsWith("!")
            || (message.toUpperCase().equals(message) && !message.toLowerCase().equals(message));
    }
}

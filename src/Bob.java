import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        /*
        * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
Bob answers 'Sure.' if you ask him a question.
He answers 'Whoa, chill out!' if you yell at him.
He says 'Fine. Be that way!' if you address him without actually saying anything.
He answers 'Whatever.' to anything else.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Talk to Bob:");
        String message = input.nextLine();

        if (message.endsWith("?")) { // It's a question!
            System.out.println("Sure.");
        } else if (message.trim().isEmpty()) {
            // "     ".toUpperCase()
            System.out.println("Fine. Be that way!");
        } else if (message.endsWith("!")
            || (message.toUpperCase().equals(message) && !message.toLowerCase().equals(message))
            ) {
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
}

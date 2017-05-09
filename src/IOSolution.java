import java.util.Scanner;

public class IOSolution {
    public static void main(String[] args) {
        Scanner input;
        int aNumber;

        input = new Scanner(System.in);  // new object of the class Scanner, instantiation
        //Scanner input = new Scanner(System.in);
        // symmetric
        //System.out;
        // 1.
        System.out.println("Enter an integer value");
        aNumber = input.nextInt();
        System.out.println(aNumber);
        // 2.
        System.out.println("Enter a word");
        String word = input.next();
        System.out.println(word);

        System.out.println("Enter another word");
        String secondWord = input.next();
        System.out.println(secondWord);

        System.out.println("Enter a third word");
        String thirdWord = input.next();
        System.out.println(thirdWord);

        input.nextLine();  // get rid of the extra enter from the last call to `next`

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        System.out.println(sentence);

        // input -> process -> output
    }
}

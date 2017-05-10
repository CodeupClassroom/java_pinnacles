import java.util.Scanner;

public class TableOfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wantsToContinue;
        do {
            System.out.println("What number would you like to go up to?");
            int limit = input.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= limit; i++) {
                // padding
                System.out.printf("%-7d| %-8s|%d%n", i, i * i, i * i * i);
            }
            System.out.println("Do you want to continue? (y/n)");
            wantsToContinue = input.next();
        } while (wantsToContinue.equalsIgnoreCase("y"));

    }
}

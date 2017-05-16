import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        // Input the information of the products that I bought
        // Either print a receipt, accept the products information, close the
        // application
        // Decomposing > Compose from the beginning
        // Transformations constant->variable->conditional->loop
        // Refactoring

        // loop
        // product description, product price, quantity -> parts of something
        // ^ receipt line
        // receipt
        Scanner input = new Scanner(System.in);
        String receipt = ""; // accumulator
        String wantsToContinue;
        do {
            System.out.println("Enter the name of the product");
            String productDescription = input.nextLine();
            System.out.println("Enter the price of the product");
            double productPrice = input.nextDouble();
            System.out.println("Enter the quantity that you're buying");
            int quantity = input.nextInt();
            // Remove trailing enter, it would produce an error before reading the next product description
            input.nextLine();

            String receiptLine = String.format(
                "%s $%.2f %d\n",
                productDescription, productPrice, quantity
            );
            receipt += receiptLine;
            System.out.println(receipt);

            System.out.println("Do you want to buy another product? (y/n)");
            wantsToContinue = input.nextLine();
        } while ("y".equalsIgnoreCase(wantsToContinue));
    }
}

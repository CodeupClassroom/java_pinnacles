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
        System.out.println("Enter the name of the product");
        String productDescription = input.nextLine();
        System.out.println("Enter the price of the product");
        double productPrice = input.nextDouble();
        System.out.println("Enter the quantity that you're buying");
        int quantity = input.nextInt();

        String receiptLine = String.format(
            "%s $%.2f %d",
            productDescription, productPrice, quantity
        );

        System.out.println(receiptLine);
    }
}

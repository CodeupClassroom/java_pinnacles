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
        String productDescription = "Mango";
        double productPrice = 2.5;
        int quantity = 10;

        String receiptLine = String.format(
            "%s $%.2f %d",
            productDescription, productPrice, quantity
        );

        System.out.println(receiptLine);
    }
}

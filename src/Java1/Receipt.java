package Java1;

public class Receipt {
    private String lines; // accumulator
    private double total; // accumulator

    public Receipt() { // constructor, doesn't need a return type
        lines = "";
        total = 0;
    }

    public void addLine(Product product, int quantity) {
        double productTotal = product.totalPrice(quantity);

        String receiptLine = String.format(
            "%s %d $%.2f\n",
            product.format(), quantity, productTotal
        );

        lines += receiptLine;
        total += productTotal;
    }

    public String print() {
        return String.format("%sTotal is: $%.2f", lines, total);
    }

}

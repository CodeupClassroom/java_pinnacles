package Java1;

//default
public class Product { // start of a block/body
    // package visibility
    // public for all the classes in this package (folder)
    // Objects have state
    private String description;
    private double price;

    // how should a new product look like?
    // constructors are public because otherwise we couldn't create objects
    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // encapsulation
    public double totalPrice(int quantity) {
        return price * quantity;  // methods
    }

    public String format() {
        return  String.format("%s $%.2f", description, price);
    }

} // end of a block/body


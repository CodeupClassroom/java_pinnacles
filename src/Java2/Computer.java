package Java2;

/**
 * Created by Fer on 5/16/17.
 */
public class Computer {

    public double screenSize;
    public String brand;
    public String OS;
    public String CPU;
    public double RAM;
    public String type;
    private double price;
    private int inventory;
    static final String category = "Electronic";

    public Computer(String type){
        this.type = type;
    }

    public boolean powerOn(){
        System.out.println("I'm on!");
        return true;
    }

    public double getTotalPrice(boolean discount){
        if(discount){
            return (price * .9);
        }

        return price;

    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double outsidePrice){
        this.price = outsidePrice;
    }

    public String getINumbers(){
        return "#"+ this.getInventory();
    }

    private int getInventory(){
        return this.inventory;
    }

}

package Java2;

/**
 * Created by Fer on 5/16/17.
 */
public class BestBuy {

    public static void main(String[] args) {

        Computer mac = new Computer("Laptop");
        Computer windows = new Computer("Laptop");
        Computer desktopLinux = new Computer("Desktop");

        mac.CPU = "1Ghz";
        System.out.println(mac.CPU);

        //Turn on the Mac
        mac.powerOn();

        System.out.println(windows.CPU);

        System.out.println(Computer.category);

        mac.setPrice(100);
        windows.setPrice(80);

        System.out.println(mac.getPrice());
        System.out.println(windows.getPrice());


        System.out.println("The total is: " + mac.getTotalPrice(true));
        System.out.println("The total is: " + windows.getTotalPrice(false));

        mac.type = "Tablet";
        System.out.println(mac.type);
        System.out.println(desktopLinux.type);
        System.out.println(windows.type);

        mac.getINumbers();

    }

}

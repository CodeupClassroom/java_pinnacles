package Abstract_Interfaces;

/**
 * Created by Fer on 5/19/17.
 */
public class AbsClassInterfaces {

    public static void main(String[] args) {

        Developer fer = new Developer("Fer", 1);
        System.out.println(fer.work());
        System.out.println(fer.getPay());

        Accountant stacy = new Accountant("Stacy", 2);
        System.out.println(stacy.work());
        System.out.println(stacy.getPay());

    }

}

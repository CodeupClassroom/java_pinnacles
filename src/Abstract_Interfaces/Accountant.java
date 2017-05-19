package Abstract_Interfaces;

/**
 * Created by Fer on 5/19/17.
 */
public class Accountant extends Employee {

    public Accountant(String name, double salary){
        super(name, salary);
    }

    @Override
    public String work() {
        return "Do numbers stuff, do payments";
    }
}

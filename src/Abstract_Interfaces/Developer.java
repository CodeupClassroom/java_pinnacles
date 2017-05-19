package Abstract_Interfaces;

/**
 * Created by Fer on 5/19/17.
 */
public class Developer extends Employee {

    public Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    public String work() {
        return "Code, code, bugs, fix, code";
    }

}

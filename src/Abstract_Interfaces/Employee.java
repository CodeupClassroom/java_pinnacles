package Abstract_Interfaces;

/**
 * Created by Fer on 5/19/17.
 */
// An Abstract class will allow you to mention the methods (Actions) or implement the process for them
abstract class Employee {

    private double salary;
    private String name;

    public Employee(String name, double salary){
        this.salary = salary;
        this.name = name;
    }

    public abstract String work();

    public double getPay(){
        return this.salary;
    }

}

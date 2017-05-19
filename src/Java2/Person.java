package Java2;

// Favor composition over inheritance
// Inheritance breaks encapsulation

// A final class cannot be extended
// It cannot have children classes
/* final */ public class Person {
    protected String name;  // Is visible for the children, and classes on the same package
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String description() {
        return String.format(
            "This is %s and %s is %d years old",
            name,
            'F' == gender ? "she" : "he",
            age
        );
    }
}

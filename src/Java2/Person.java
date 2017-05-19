package Java2;

public class Person {
    private String name;
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

    public static void main(String[] args) {
        Person person = new Person("Fer", 27, 'M');
        System.out.println(person.description());

        Student student = new Student(
            "Luis", 37, 'M', "Pinnacles", "Java"
        );
        System.out.println(student.description());
    }
}

class Student extends Person {
    private String cohort;
    private String backendLanguage;

    public Student(String name, int age, char gender, String cohort, String backendLanguage) {
        super(name, age, gender);
        this.cohort = cohort;
        this.backendLanguage = backendLanguage;
    }

    public String description() {
        return String.format(
            "%s. Cohort: %s Language: %s", super.description(), cohort, backendLanguage
        );
    }
}


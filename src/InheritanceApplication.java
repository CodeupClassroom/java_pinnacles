import Java2.Person;
import Java2.Student;

public class InheritanceApplication {
    public static void main(String[] args) {
        Person fer = new Person("Fer", 27, 'M');
        Student luis = new Student(
            "Luis", 37, 'M', "Pinnacles", "Java"
        );
        // student.name = "Zach"; As this is protected is not visible outside the package
        Student ryan = new Student("Ryan", 29, 'M', "Olympic", "PHP");


        Person[] people = {
            fer, // person
            new Person("Ben", 20, 'M'), // person
            luis, // student is a person
            ryan // student is a person
        };
        for (Person person : people) {
            System.out.println(person.description()); // they all can call the method description
        }

        Student[] students = {
            luis,
            ryan,
            // fer, fer doesn't have a method writeCode
        };
        for (Student student : students) {
            System.out.println(student.writeCode());
        }
    }

}

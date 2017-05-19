package Java2;

public class Student extends Person {
    private String cohort;
    private String backendLanguage;

    public Student(String name, int age, char gender, String cohort, String backendLanguage) {
        super(name, age, gender);
        this.name = name.toUpperCase();
        this.cohort = cohort;
        this.backendLanguage = backendLanguage;
    }

    @Override  // Annotation
    public String description() {
        return String.format(
            "%s. Cohort: %s Language: %s", super.description(), cohort, backendLanguage
        );
    }

    public String writeCode() {
        return "Some code";
    }
}


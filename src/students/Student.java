/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Luis");
        student1.addGrade(89);
        student1.addGrade(70);
        student1.addGrade(90);

        System.out.println(student1.getGradeAverage());

        Student student2 = new Student("Zach");
        student2.addGrade(100);
        student2.addGrade(50);
        student2.addGrade(80);

        System.out.println(student2.getName() + " " + student2.getGradeAverage());
    }
}

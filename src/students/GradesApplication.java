/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package students;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        Student student1 = new Student("Fernando");
        student1.addGrade(80);
        student1.addGrade(90);

        Student student2 = new Student("Justin");
        student2.addGrade(100);
        student2.addGrade(78);
        student2.addGrade(90);

        Student student3 = new Student("Zach");
        student3.addGrade(70);
        student3.addGrade(45);
        student3.addGrade(98);

        students.put("fernando", student1);
        students.put("justin", student2);
        students.put("zach", student3);
    }
}

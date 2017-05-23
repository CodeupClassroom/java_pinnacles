/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package students;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");

        students.forEach((username, student) -> System.out.print("|" + username + "| "));

        System.out.println("\nWhat student would you like to see more information on?");
        String username = input.next();

        //if (students.get(username) == null) {
        if (!students.containsKey(username)) {
            System.out.println("Sorry, no student found with the github username of " + username + ".");
        } else {
            Student student = students.get(username);
            System.out.println("Name: " + student.getName() + " - Gihub Username: " + username);
            System.out.println("Current Average: " + student.getGradeAverage());
        }

        System.out.println(username);
    }
}

public class Types {
    public static void main(String[] args) {
        // Types in JS
        // string, boolean, number, array, object
        // Numbers have a classification (size):
        // integers
        // byte, short, int, long
        // floating point numbers
        // float, double

        // Java doesn't have undefined -> compile time error

        // var age;  // variable declaration
        // age = 17; // assignment
        //double price = 100.25;
        double price;  // variable declaration
        // System.out.println(price);// undefined, compilation error in Java
        price = 100.25; // assignment
        System.out.println(price);

        // const PI = 3.14;  // In JS
        final float PI = 3.14f; // A constant in Java

        //int abstract = 2;

        // Java makes a distinction between strings an a single character

        // Declare a variable called cohort with the value Pinnacles
        // in JS
        // var cohort = 'Pinnacles';
        String cohort = "Pinnacles"; // Variable declaration + an assignment
        // declare a variable the count of students in the classroom
        // var studentsCount = 27;
        short studentsCount = 27;
        // declare a boolean variable to represent if students like Java
        // var studentsLikeJava = true;
        boolean studentsLikeJava = true;
        //String studentsLikeJava = "yes"; // invalid

        char grade = 'A';  // Use single quotes for char

        //studentsLikeJava = "yes"; // static types
        studentsLikeJava = false; // they love it!

        System.out.println(cohort);
        System.out.println(studentsCount);
        System.out.println(studentsLikeJava);
        System.out.println(grade);







    }
}

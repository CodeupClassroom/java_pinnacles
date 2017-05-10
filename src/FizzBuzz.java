public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) { // is this a multiple of both 3 and 5?
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // is this a multiple of three?
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // is this a multiple of 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

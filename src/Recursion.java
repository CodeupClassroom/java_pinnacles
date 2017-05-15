/**
 * Created by Fer on 5/11/17.
 */
public class Recursion {

    public static void main(String[] args) {
        // Call the recursive method
        countDown(10);
    }

    public static void countDown(Integer number){

        // Solution without recursion using loops

//        for(int c = number; c >= 0; c--){
//            System.out.println(c);
//        }



        // Solution without loops using recursion

        System.out.println(number);

        // How to stop
        if(number <= 0){
            // On a void method return stops the execution of the method and doesn't return anything
            return;
        }

        // How do i continue
        number--;
        countDown(number);

    }

}

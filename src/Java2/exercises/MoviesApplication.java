package Java2.exercises;

import java.util.Scanner;

/**
 * Created by Fer on 5/18/17.
 */
public class MoviesApplication {

    public static void main(String[] args) {

        MoviesArray listObject = new MoviesArray();
        Movie[] listOfMovies = listObject.findAll();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("" +
                    "What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            System.out.println("Choose one");

            switch (scan.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for(Movie m : listOfMovies){
                        System.out.println( m.getName() + " - " + m.getCategory() );
                    }
                    break;
                case 2:
                    for(Movie m : listOfMovies){
                        if(m.getCategory().equalsIgnoreCase("animated")){
                            System.out.println( m.getName() + " - " + m.getCategory() );
                        }
                    }
                    break;
                default:
                    System.out.println("No valid, try again");

            }
        }


    }

}

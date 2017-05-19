package Java2.exercises;

/**
 * Created by Fer on 5/18/17.
 */
public class Movie {

    private String name;
    private String category;

    public Movie(String n, String c){
        this.name = n;
        this.category = c;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

}

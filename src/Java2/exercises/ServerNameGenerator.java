package Java2.exercises;

/**
 * Created by Fer on 5/18/17.
 */
public class ServerNameGenerator {



    public static void main(String[] args) {

        String[] nouns = {"ball","dog", "sister"};
        String[] adjs = {"pretty", "ugly" , "tiny"};

        System.out.println(generateName(nouns, adjs));

    }

    public static String generateName(String[] nouns, String[] adjs){

        int rnd = (int) (Math.random() * (nouns.length));
        int rnd2 = (int) (Math.random() * (adjs.length));

        return nouns[rnd] + " " + adjs[rnd2];

    }

}

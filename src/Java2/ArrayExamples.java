package Java2;

import Java1.Product;

import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        double[] prices; // variable declaration
        prices = new double[4];  // initialize and specify the size of the array

        prices[0] = 12.5;
        System.out.println(prices[0]);
        System.out.println(prices[3]);

        String[] names;
        names = new String[6];
        System.out.println(names[3]);

        boolean[] apples;         // variable declaration
        apples = new boolean[10]; // variable initialization
        System.out.println(apples[4]);

        int[] oranges = new int[20]; // declaration + initialization
        // oranges[30] = 7; // this is a run-time error

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements should this array have?");
        int size = input.nextInt();

        int[] elements = new int[size];

        // enumerate the elements of the array on creation
        String[] beatles = {
            "John", // separate elements with comma
            "Paul",
            "George",
            "Ringo"
        }; // regular end of line, it needs a semi-colon
        System.out.println(beatles[2].toUpperCase());

        String[] beatlesCopy = new String[4];
        beatlesCopy[0] = "John";
        beatlesCopy[1] = "Paul";
        beatlesCopy[2] = "George";
        beatlesCopy[3] = "Ringo";

        Product[] products = new Product[10];
        products[0] = new Product("Mango", 2.5);
        // products[1] = input;
        Product[] myBasket = {
            new Product("Mango", 2.5),
            new Product("Coke", 1.5)
        };

        System.out.println(myBasket[1].format());

        System.out.println(beatles[beatles.length - 1]);
    }
}

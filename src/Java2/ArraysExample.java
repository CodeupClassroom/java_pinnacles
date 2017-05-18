package Java2;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] prices = new int[10];
        for (int price : prices) { // for each price in prices do
            System.out.println(price);
        }
        Arrays.fill(prices, 5);
        for (int price : prices) {
            System.out.println(price);
        }

        int[] threeNumbers = {1, 2, 3};      // 6f45
        int[] sameThreeNumbers = {1, 3, 2}; //dd54

        // are these two variables the same? (do they point to the same memory address?)
        System.out.println(threeNumbers == sameThreeNumbers);
        // do these 2 arrays have the same content and are the elements in the same order?
        Arrays.sort(sameThreeNumbers); // sort the second array
        System.out.println(Arrays.equals(threeNumbers, sameThreeNumbers));
        // similar to string.equals(another)

        int[] thirdCopy = Arrays.copyOf(threeNumbers, threeNumbers.length);
        System.out.println(Arrays.toString(thirdCopy));

        int[] moreNumbers = {2, 56, 7, 34, 20, 45, 67};

        int index = Arrays.binarySearch(moreNumbers, 34);
        System.out.println("34 is at index " + index);

        // -1 if the number isn't there
        System.out.println(Arrays.binarySearch(moreNumbers, -56));
    }
}

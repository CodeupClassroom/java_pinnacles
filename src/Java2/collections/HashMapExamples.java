/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package Java2.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        // key - value
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);


        // Trying to get an element with an invalid key will not throw an exception, will return a null instead.
        System.out.println(map.get("asdasd"));

        System.out.println(map.size());


        // It is really hard to loop in a map using the usual loops so the next example uses the forEach function, try to avoid this:
//        for(int i = 0; i < map.size(); i++){
//            System.out.println(map.get(i));
//        }


        //Looping in a map using the forEach function, don't forget to use the parameters in the right order (KEY, VALUE)
        map.forEach((key, value) -> {
            System.out.println("key:" + key + " value: " + value);
        });

    }
}

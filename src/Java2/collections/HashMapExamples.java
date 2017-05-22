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

        System.out.println(map.get("one"));
    }
}

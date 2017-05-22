/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package Java2.collections;

import Java2.shapes.Measurable;
import Java2.shapes.Quadralateral;
import Java2.shapes.Rectangle;
import Java2.shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Fer");
        list.add(1);
        list.add(new Rectangle(2.4, 4.3));
        list.add(new Square(4.3));
        list.add(true);  // type unsafe

        Square x = (Square) (list.get(3));
        System.out.println(x.getArea());

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Object element : list) {
            System.out.println(element);
        }


        // Generics
        List<String> strings = new ArrayList<>();
        strings.add("Zach");
        for (String string : strings) {
            System.out.println(string);
        }

        // Boxing -> Wrapper classes for primitive types
        // int -> Integer
        // double -> Double
        // float -> Float
        List<Integer> integers = new ArrayList<>();
        integers.add(45);
        integers.add(56);
        for (Integer number : integers) {
            System.out.println(number);
        }

        List<Measurable> thingsWith4Sides = new ArrayList<>();
        thingsWith4Sides.add(new Square(5.4));
        thingsWith4Sides.add(new Rectangle(5.4, 1.9));

        for (Measurable measurable : thingsWith4Sides) {
            System.out.println(measurable);
        }

        System.out.println(thingsWith4Sides.get(1).getArea());
    }
}

package io.github.fatihbozik.ch3.reviewingocacollections.example2;

import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        String[] array = {"gerbil", "mouse"};         // [gerbil, mouse]
        List<String> list = Arrays.asList(array);     // returns fixed size list
        list.set(1, "test");                          // [gerbil, test]
        array[0] = "new";                             // [new, test]
        System.out.println("List: " + list);
        System.out.println("Array: " + Arrays.toString(array));

        String[] array2 = (String[]) list.toArray();  // [new, test]
        list.remove(1);                        // throws UnsupportedOperationException
    }
}

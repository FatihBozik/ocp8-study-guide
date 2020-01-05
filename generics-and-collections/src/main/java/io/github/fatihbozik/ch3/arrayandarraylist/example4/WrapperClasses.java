package io.github.fatihbozik.ch3.arrayandarraylist.example4;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);                        // [1] autoboxing occurs
        numbers.add(new Integer(3));    // [1, 3]
        numbers.add(new Integer(5));    // [1, 3, 5]
        numbers.remove(1);              // [1, 5] Invokes E remove(int index)
        numbers.remove(new Integer(5)); // [1] Invokes boolean remove(Object o)
        System.out.println(numbers);
    }
}

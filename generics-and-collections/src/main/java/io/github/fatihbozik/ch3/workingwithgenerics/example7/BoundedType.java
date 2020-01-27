package io.github.fatihbozik.ch3.workingwithgenerics.example7;

import java.util.ArrayList;
import java.util.List;

public class BoundedType {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
//        total(integerList); // DOES NOT COMPILE
    }

    public static long total(List<Number> list) {
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }
        return count;
    }
}

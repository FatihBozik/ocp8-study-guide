package io.github.fatihbozik.ch3.workingwithgenerics.example7;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        System.out.println("Total of integer number: " + total(integerList));

        List<Float> floatList = new ArrayList<>();
        floatList.add(7f);
        floatList.add(10f);
        System.out.println("Total of float numbers: " + total(floatList));
    }

    public static long total(List<? extends Number> list) { // public static long total(List list) {
        long count = 0;                                     //    long count = 0;
        //
        for (Number number : list) {                        //    for(Object obj: list) {
            count += number.longValue();                    //        Number number = (Number) obj;
        }                                                   //        count += number.longValue();
        //    }
        return count;                                       //    return count;
    }                                                       //  }

    public static <N extends Number> long total2(List<N> list) { // public static long total(List list) {
        long count = 0;                                          //    long count = 0;
        //
        for (Number number : list) {                             //    for(Object obj: list) {
            count += number.longValue();                         //        Number number = (Number) obj;
        }                                                        //        count += number.longValue();
        //    }
        return count;                                            //    return count;
    }                                                            //  }
}

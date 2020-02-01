package io.github.fatihbozik.ch3.workingwithgenerics.example14;

import java.util.ArrayList;
import java.util.List;

// @formatter:off
class A { }
class B extends A { }
class C extends B { }
// @formatter:on

public class Demo {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();
        // List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
        List<? super B> list5 = new ArrayList<A>();
        // List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE
    }
}

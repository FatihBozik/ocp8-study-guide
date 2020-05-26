package io.github.fatihbozik.ch3.workingwithgenerics.example15;

import java.util.ArrayList;
import java.util.List;

// @formatter:off
class A { }
class B extends A { }
class C extends B { }
// @formatter:on

public class TrickyOnes {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Fatih");
        TrickyOnes trickyOnes = new TrickyOnes();
        final String name = trickyOnes.method1(names);
        System.out.println(name);
    }

    <T> T method1(List<? extends T> list) {
        return list.get(0);
    }

//    <T> <? extends T> method2(List<? extends T> list) { // DOES NOT COMPILE
//        list.get(0);
//    }

//    <B extends A> B method3(List<B> list) {
//        return new B(); // DOES NOT COMPILE
//    }

    void method4(List<? super B> list) {

    }

//    <X> void method5(List<X super B> list) { // DOES NOT COMPILE
//
//    }
}

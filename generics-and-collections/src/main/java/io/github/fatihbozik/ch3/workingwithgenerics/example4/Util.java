package io.github.fatihbozik.ch3.workingwithgenerics.example4;

import io.github.fatihbozik.ch3.workingwithgenerics.example2.Crate;

public class Util {
    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
    public static <T> void sink(T t) {

    }
    public static <T> T identity(T t) {
        return t;
    }
//    public static T noGood(T t) { // DOES NOT COMPILE
//        return t;
//    }

    public <U> void another(U u) {

    }
}

class Demo {
    public static void main(String[] args) {
        Util.<String>ship("6");

        Util util = new Util();
        util.<Long>another(3L);
    }
}

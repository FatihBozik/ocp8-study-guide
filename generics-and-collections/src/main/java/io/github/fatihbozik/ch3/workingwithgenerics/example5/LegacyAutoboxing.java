package io.github.fatihbozik.ch3.workingwithgenerics.example5;

import java.util.ArrayList;
import java.util.List;

public class LegacyAutoboxing {

    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(5);

//      int primitive = numbers.get(0); // DOES NOT COMPILE
//      Integer wrapper = numbers.get(0); // DOES NOT COMPILE
    }
}

package io.github.fatihbozik.ch3.workingwithgenerics.example10;

import java.util.ArrayList;
import java.util.List;

public class ReifiableOrNot {

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        boolean instanceTest = aList instanceof List<?>;
        System.out.println(instanceTest);

//        boolean instancetest = aList instanceof List<? extends Object>; // DOES NOT COMPILE
    }
}

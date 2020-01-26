package io.github.fatihbozik.ch3.reviewingocacollections.example5;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator2 {
    List<String> names;

    DiamondOperator2() {
        names = new ArrayList<>(); // matches instance variable declaration
    }

    public void copyNames() {
        ArrayList<String> copyOfNames;
        copyOfNames = new ArrayList<>(); // matches local variable declaration
    }
}

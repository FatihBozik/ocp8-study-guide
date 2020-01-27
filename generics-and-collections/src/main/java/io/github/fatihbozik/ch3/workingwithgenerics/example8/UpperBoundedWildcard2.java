package io.github.fatihbozik.ch3.workingwithgenerics.example8;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard2 {
    static class Sparrow extends Bird {
    }

    static class Bird {
    }

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
//        birds.add(new Sparrow());  // DOES NOT COMPILE
//        birds.add(new Bird());     // DOES NOT COMPILE
    }
}

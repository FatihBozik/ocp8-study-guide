package io.github.fatihbozik.ch3.workingwithgenerics.example13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundTricky {

    public static void main(String[] args) {
        List<? super IOException> exceptions = new ArrayList<Exception>();
//      exceptions.add(new Object()); // DOESNT COMPILE
//      exceptions.add(new Exception()); // DOESNT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }
}

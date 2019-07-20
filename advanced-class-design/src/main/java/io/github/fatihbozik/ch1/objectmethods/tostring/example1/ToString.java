package io.github.fatihbozik.ch1.objectmethods.tostring.example1;

import java.util.ArrayList;

/**
 * @author Fatih Bozik
 */
public class ToString {
    public static void main(String[] args) {
	System.out.println(new ArrayList()); // []
	System.out.println(new String[0]);   // [Ljava.lang.String;@61bbe9ba
    }
}
package io.github.fatihbozik.genericsandcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enthuware1 {
    public static final String id = "enthuware.ocpjp.v8.2.1140";

    public static void main(String[] args) {
        /*
            Here, you are declaring a map that contains ArrayList as values.
            But later in the code, you are adding "cities", which of type List.
         */
        // Map<String, ArrayList<String>> stateCitiesMap = new HashMap<>();

        /*
            You cannot embed a diamond operator within another generic class instantiation.
            Thus, new HashMap<String, List<>> is invalid because of List<>.
        */
        // Map<String, List<String>> stateCitiesMap = new HashMap<String, List<>>();

        /*
            You cannot embed a diamond operator within another generic class instantiation.
         */
        // Map<String , ArrayList<String>> stateCitiesMap = new HashMap<<>, List<>>();

        /*
            ArrayList<String> is not compatible with List<String> in this case.
            Both the sides must have the same type.
         */
        // Map<String, List<String>> stateCitiesMap = new HashMap<String, ArrayList<String>>();

        Map<String, List<String>> stateCitiesMap = new HashMap<>(); // COMPILES
        // Map<String, List<String>> stateCitiesMap = new HashMap<String, List<String>>(); // COMPILES

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Albany");
        stateCitiesMap.put("NY", cities);
    }
}

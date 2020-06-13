package io.github.fatihbozik.ch3.j8addition;

import java.util.HashMap;
import java.util.Map;

public class Example8 {
    public static void main(String[] args) {
        // region merge method: Key has null value in map
        Map<String, String> map = new HashMap<>();
        map.put("a", null);
        map.merge("a", "b", (o, n) -> {
            System.out.println("Not called");
            return n;
        });
        System.out.println(map); // {a=b}

        map.put("a", null);
        map.merge("a", "c", (o, n) -> {
            System.out.println("Not called");
            return null;
        });
        System.out.println(map); // {a=c}
        // endregion

        // region merge method: Key has non-null value in map
        map.put("a", "d");
        map.merge("a", "e", (o, n) -> {
            System.out.print("Called: ");
            return null;
        });
        System.out.println(map); // Called: {}

        map.put("a", "e");
        map.merge("a", "f", (o, n) -> {
            System.out.print("Called: ");
            return n;
        });
        System.out.println(map); // Called: {a=f}
        // endregion

        // region merge method: Key not in map
        map.clear();
        map.merge("b", "g", (o, n) -> {
            System.out.print("Not Called: ");
            return n;
        });
        System.out.println(map); // {b=g}
        // endregion

        // region merge method: Key not in map
        map.clear();
        map.merge("c", "h", (o, n) -> {
            System.out.print("Not Called: ");
            return null;
        });
        System.out.println(map); // {c=h}
        // endregion
    }
}

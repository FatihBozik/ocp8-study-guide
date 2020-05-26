package io.github.fatihbozik.ch3.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet()) {
            System.out.print(key + ","); // koala,giraffe,lion,
        }
        System.out.println();
        // System.out.println(map.contains("lion")); // DOES NOT COMPILE
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size()); // 3

        System.out.println();

        Map<String, String> map2 = new TreeMap<>();
        map2.put("koala", "bamboo");
        map2.put("lion", "meat");
        map2.put("giraffe", "leaf");
        String food2 = map2.get("koala"); // bamboo
        for (String key : map2.keySet()) {
            System.out.print(key + ","); // giraffe,koala,lion,
        }
    }
}

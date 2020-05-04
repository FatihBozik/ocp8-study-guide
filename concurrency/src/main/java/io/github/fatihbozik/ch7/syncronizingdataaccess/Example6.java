package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Example6 {
    public static void main(String[] args) {
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) {
            foodData.remove(key); // throws ConcurrentModificationException
        }

        Map<String, Object> foodData2 = new ConcurrentHashMap<>();
        foodData2.put("penguin", 1);
        foodData2.put("flamingo", 2);
        for (String key : foodData2.keySet()) {
            foodData2.remove(key); // works
        }
    }
}

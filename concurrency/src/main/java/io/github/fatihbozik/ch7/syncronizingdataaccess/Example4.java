package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.HashMap;
import java.util.Map;

public class Example4 {
    private Map<String, Object> foodData = new HashMap<>();

    public synchronized void put(String key, String value) {
        foodData.put(key, value);
    }

    public synchronized Object get(String key) {
        return foodData.get(key);
    }
}

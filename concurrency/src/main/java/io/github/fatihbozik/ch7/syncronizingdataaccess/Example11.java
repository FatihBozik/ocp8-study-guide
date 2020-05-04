package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.*;

public class Example11 {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(Arrays.asList(4, 3, 52));
        synchronized (list) {
            for (int data : list) {
                System.out.print(data + " ");
            }
        }

        System.out.println();

        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
        for (String key : synchronizedFoodData.keySet()) {
            synchronizedFoodData.remove(key); // throws ConcurrentModificationException
        }
    }
}

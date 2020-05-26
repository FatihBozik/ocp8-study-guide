package io.github.fatihbozik.ch3.questions;

import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);

        map.merge(1, 3, (oldValue, value) -> oldValue + value);
        map.merge(3, 3, (oldValue, value) -> oldValue + value);

        System.out.println(map); // {1=13, 2=20, 3=3}
    }
}

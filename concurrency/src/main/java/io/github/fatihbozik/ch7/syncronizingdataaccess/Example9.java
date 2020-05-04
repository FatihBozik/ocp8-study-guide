package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Example9 {
    public static void main(String[] args) {
        NavigableSet<String> citySet = new ConcurrentSkipListSet<>();
        citySet.add("New Delhi");
        citySet.add("Mumbai");
        citySet.add("Chennai");
        citySet.add("Hyderabad");
        System.out.println(citySet); // [Chennai, Hyderabad, Mumbai, New Delhi]

        NavigableMap<String, String> cityMap = new ConcurrentSkipListMap<>();
        cityMap.put("ND", "New Delhi");
        cityMap.put("MU", "Mumbai");
        cityMap.put("CH", "Chennai");
        cityMap.put("HD", "Hyderabad");
        cityMap.forEach((key, value) -> System.out.printf("\n%s, %s", key, value));
        /*
        CH, Chennai
        HD, Hyderabad
        MU, Mumbai
        ND, New Delhi
         */
    }
}

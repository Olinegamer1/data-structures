package com.company;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map =  Map.of(
          "Two", 2,
          "Three", 3,
          "Five", 5,
          "One", 1,
          "Four", 4
        );
        Map<String, Integer> sortedByValue = sortByValue(map);
        sortedByValue.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static <K, V> Map<K, V> sortByValue(Map<K, V> map, Comparator<? super V> comparator) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}

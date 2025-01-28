package com.practice.java9.second;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.List.of;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<String> immutableList = of("Giraffe", "Hippo", "Iguana");
        //Adding new element to immutable list will throw java.lang.UnsupportedOperationException.
        //immutableList.add("Test");
        System.out.println("Immutable list: " + immutableList);
        //Adding duplicate element to immutable set will throw java.lang.IllegalArgumentException.
        Set<String> immutableSet = Set.of("Giraffe", "Hippo", "Iguana");
        System.out.println("Immutable set: " + immutableSet);
        Map<String, String> immutableMap = Map.of("a", "b", "c", "d");
        //Adding new element to immutable map will throw java.lang.UnsupportedOperationException.
        //immutableMap.put("x", "y");
        System.out.println("Immutable map: " + immutableMap);
    }
}

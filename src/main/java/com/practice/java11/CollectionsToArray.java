package com.practice.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsToArray {
    public String[] get(List<String> inputList) {
        return inputList.toArray(String[]::new);
    }

    public List<String> checkNotBlank(List<String> inputList) {
        return inputList.stream().filter(Predicate.not(input -> input.trim().isEmpty())).collect(Collectors.toList());
    }
}

package com.practice.java9.second;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Process optional streams and return actual value.
 */
public class OptionalStream {
    public static void main(String[] args) {
        List<String> immutableList = List.of("Giraffe", "Hippo", "Iguana");
        List<Optional<String>> optionalList = immutableList.stream().map(Optional::of)
                .collect(Collectors.toList());
        System.out.println("Optional list: " + optionalList);
        List<String> filteredList = optionalList.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);
    }
}

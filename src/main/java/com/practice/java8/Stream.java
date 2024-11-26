package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream example to create stream and print uppercase and lowercase string from the list.
 */
public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "B", "C", "D", "e");
        System.out.println("Print uppercase string values: " + list.stream().filter(v -> v.matches("[A-Z]")).collect(Collectors.toList()));
        System.out.println("Print lowercase string values: " + list.stream().filter(v -> v.matches("[a-z]")).collect(Collectors.toList()));
    }
}

package com.practice.java11;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class StringMethods {
    public static void main(String[] args) {
        String str = " This is Java 11\nnew String methods example!  ";
        System.out.println("Original string length: " + str.length());
        System.out.println("isBlank: " + str.isBlank());
        System.out.println("Strip: " + str.strip().length());
        System.out.println("Lines: " + str.lines().count());
        System.out.println("stripLeading: " + str.stripLeading().length());
        System.out.println("stripTrailing: " + str.stripTrailing().length());
        System.out.println("Repeat: " + str.repeat(3).length());

        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");
    }
}
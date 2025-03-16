package com.jdk11.practice;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariable {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "", "d", null);
        System.out.println("Value could be null:");
        System.out.println(
                list.stream().filter((@Nullable var x) -> x != null && !x.isEmpty()).collect(Collectors.toList()));
        System.out.println("Value cannot be null:");
        System.out.println(list.stream().filter((@Nonnull var x) -> !x.isEmpty()).collect(Collectors.toList()));
    }
}

package com.practice8.java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

class CollectionsToArrayTest {

    @ParameterizedTest
    @ValueSource(strings = {"a,b,c", "d,e,f"})
    void get(String input) {
        List<String> inputList = Arrays.asList(input.split(","));
        String[] output = new CollectionsToArray().get(inputList);
        Assertions.assertEquals(inputList, Arrays.asList(output));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a, ,c", "d,e,f"})
    void checkNotBlank(String inputString) {
        List<String> inputList = Arrays.asList(inputString.split(","));
        List<String> output = new CollectionsToArray().checkNotBlank(inputList);
        Assertions.assertEquals(0, output.stream().filter(i -> i.trim().isBlank()).count());
    }
}
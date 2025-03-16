package com.practice8.java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

class FileCreatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"File text", "File Text"})
    void writeFile(String inputString) throws IOException {
        FileCreator fileCreator = new FileCreator();
        String outputString = fileCreator.writeFile(inputString);
        Assertions.assertEquals(inputString, outputString);
    }
}
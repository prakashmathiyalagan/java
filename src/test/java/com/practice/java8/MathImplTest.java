package com.practice.java8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathImplTest {
    private MathImpl mathImpl = null;

    /**
     * This method will be called before each test.
     */
    @BeforeEach
    void setUp() {
        System.out.println("Creating math impl object");
        mathImpl = new MathImpl();
    }

    /**
     * This method will be called after each test.
     */
    @AfterEach
    void tearDown() {
        mathImpl = null;
    }

    @Test
    void addNumbers() {
        System.out.println("Current object: " + mathImpl);
        Integer result = mathImpl.addNumbers().sum(2, 3);
        Assertions.assertEquals(5, result);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.ValueSource(ints = {1, 2})
    void addOneNumber(Integer a) {
        System.out.println("Current object: " + mathImpl);
        Integer result = mathImpl.addNumbers().sum(a, 2);
        Assertions.assertEquals(a + 2, result);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({"1, 2"})
    void addTwoNumbers(Integer a, Integer b) {
        System.out.println("Current object: " + mathImpl);
        Integer result = mathImpl.addNumbers().sum(a, b);
        Assertions.assertEquals(a + b, result);
    }
}
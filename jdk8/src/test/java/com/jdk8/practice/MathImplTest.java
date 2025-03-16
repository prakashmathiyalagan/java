package com.jdk8.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathImplTest {
    private MathImpl mathImpl = null;

    /**
     * This method will be called before each test.
     */
    @Before
    public void setUp() {
        System.out.println("Creating math impl object");
        mathImpl = new MathImpl();
    }

    /**
     * This method will be called after each test.
     */
    @After
    public void tearDown() {
        mathImpl = null;
    }

    @Test
    public void addNumbers() {
        System.out.println("Current object: " + mathImpl);
        Integer result = mathImpl.addNumbers().sum(2, 3);
        Assert.assertTrue(5 == result.doubleValue());
    }

    @Test
    public void addOneNumber() {
        System.out.println("Current object: " + mathImpl);
        Integer a = 6;
        Integer result = mathImpl.addNumbers().sum(a, 2);
        Assert.assertTrue(a + 2 == result);
    }

    @Test
    public void addTwoNumbers() {
        System.out.println("Current object: " + mathImpl);
        Integer a = 10;
        Integer b = 3;
        Integer result = mathImpl.addNumbers().sum(a, b);
        Assert.assertTrue(a + b == result);
    }
}
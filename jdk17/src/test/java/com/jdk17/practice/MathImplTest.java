package com.jdk17.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class MathImplTest {
    MathImpl math;
    List list = Mockito.mock(List.class);

    @Before
    public void setUp() throws Exception {
        math = new MathImpl();
    }

    @Test
    public void testAddNumbers() {
        Assert.assertEquals(5.0, math.addNumbers().sum(2, 3), 0);
    }

    @Test
    public void mockitoTest() {
        System.out.println("Mocked list " + list);
        Mockito.when(list.get(10)).thenReturn("hello world");
        Assert.assertEquals("hello world", list.get(10));
    }
}
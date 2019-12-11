package com.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrizedCalculatorTest {
    private int a;
    private int b;
    private int expectedResult;

    private Calculator calculator;

    public ParametrizedCalculatorTest(int a, int b, int expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Before
    public void beforeEachTest() {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection inputs() {
        return Arrays.asList(new Object[][]{{1, 2, 3}, {3, 4, 7}, {8, 7, 15}});
    }

    @Test
    public void testSum()
    {
        Assert.assertEquals(expectedResult,calculator.sum(a,b));
    }
}

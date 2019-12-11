package com.java;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
        calculator = new Calculator();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
        calculator = null;
    }

    @Before
    public void beforeExecutingAnyTest() {
        System.out.println("beforeExecutingAnyTest");

    }

    @After
    public void afterExecutingAnyTest() {
        System.out.println("afterExecutingAnyTest");
    }

    @Test
    //@Ignore
    public void testCube() {
        System.out.println("testing cube");
        int n = 2;
        double cube = 8d;
        assertEquals(cube, calculator.cube(n));
    }

    @Test
    @Ignore
    public void testSum() {
        System.out.println("testing sum");
        assertEquals(30, calculator.sum(10, 20));
    }

    @Test
    public void testDiv() {
        System.out.println("testDiv");
        assertEquals(5, calculator.div(10, 2));
    }

    @Test(expected = RuntimeException.class)
    public void testDivWhen0() {
        System.out.println("testDiv");
        assertEquals(5, calculator.div(10, 0));
    }
}

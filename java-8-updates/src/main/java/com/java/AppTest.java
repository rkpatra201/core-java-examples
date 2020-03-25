package com.java;

import java.util.stream.Stream;

public class AppTest {
    public static void main(String[] args) {
        String s[] = {"10"};

        ICalculator calculator = Calculator::sum;
        System.out.println(calculator.getClass());
        int result = calculator.get(10, 20);
        System.out.println(result);

        ICalculatorInStance c = Calculator::new;
        ICalculator cal = c.get()::mul;
        System.out.println(cal.get(10, 20));

        int x = Stream.of(1, 2, 3).map(e -> e * e).reduce(0, Integer::sum).intValue();
        System.out.println(x);
    }
}

interface ICalculatorInStance {
    Calculator get();
}

interface ICalculator {
    public int get(int x, int y);
}

class Calculator {

    public Calculator() {
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;

    }
}


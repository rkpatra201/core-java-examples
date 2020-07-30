package com.java.method.ref;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculator1_Main {
    public static void main(String[] args) {

        // accessing static method
        ICalculator calculator = Calculator::sum;
        System.out.println(calculator.getClass());
        int result = calculator.get(10, 20);
        System.out.println(result);

        // accessing instance method 1
        ICalculatorInStance c = Calculator::new;
        ICalculator cal = c.get()::mul;
        System.out.println(cal.get(10, 20));

        int x = Stream.of(1, 2, 3).map(e -> e * e).reduce(0, Integer::sum).intValue();
        System.out.println(x);

        List output = Stream.of(1,2,3).map(Calculator::square).collect(Collectors.toList());
        System.out.println(output);
    }

}

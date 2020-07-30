package com.java.reference;

import com.java.common.Employee;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {
        MethodReferences m = new MethodReferences();
        Supplier<Integer> supplier = MethodReferences::findData;
        supplier = m::getData;

        Consumer<String> consumer = MethodReferences::execute;
        consumer = m::process;

        Function<String,Integer> function = MethodReferences::findLength;
        function = m::getLength;

        Predicate<Integer> validator = MethodReferences::check;
        validator=m::validate;

        IValidator validator1 = MethodReferences::check;
        validator1 = m::validate;
        validator1 = (a,b,c)->{
            return (a+b+c)%2 == 0;
        };

        Supplier<Employee> supplier1 = m::getEmployee;
        showEmployee(Employee::new);
    }

    private static void showEmployee(Supplier<Employee> e)
    {

    }
    private Employee getEmployee()
    {
        return null;
    }

    private  boolean validate(int x, int y, int z)
    {
        return (x+y+z)%2 == 0;
    }
    private static boolean check(int x, int y, int z)
    {
        return (x+y+z)%2 == 0;
    }
    private void process(String input)
    {

    }
    private static void execute(String data)
    {

    }
    private boolean validate(int x)
    {
        return true;
    }

    private static boolean check(int x)
    {
        return false;
    }
    private int getLength(String s)
    {
        return s.length();
    }

    private static int findLength(String s)
    {
        return s.length();
    }

    // supplier
    private int getData()
    {
        return 0;
    }

    // supplier
    private static int findData()
    {
        return 0;
    }
}

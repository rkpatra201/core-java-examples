package com.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class InstanceOf
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Object obj = new Employee();
        System.out.println(obj.getClass());
        Employee e =(Employee)obj;
        System.out.println(e.hashCode());
        if(obj instanceof String) {
            String s = (String) obj;
        }
        else
        {
            System.out.println(obj instanceof String);
            System.out.println(obj instanceof Employee);
        }
        boolean flag =obj.getClass().isAssignableFrom(String.class);
        System.out.println(flag);
        flag = obj.getClass().isAssignableFrom(Employee.class);
        System.out.println(flag);

        List<String> list = new ArrayList<>();
        flag = list.getClass().isAssignableFrom(LinkedList.class);
        System.out.println(flag);
        System.out.println(list instanceof LinkedList);
    }
}

class Employee
{

}

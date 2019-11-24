package com.java.streams;

import com.java.common.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {
    public static void main(String[] args) {
//        flatMapOnStringObject();
//        flatMapOnEmployeeObject();
        mapOnEmployeeObjectToGetNames();

    }
    private static void mapOnEmployeeObjectToGetNames()
    {
        Employee e1= new Employee(1,"sachin");
        Employee e2=new Employee(2,"rahul");
        List<Employee> employeeList1 = new ArrayList<>(Arrays.asList(e1,e2));

        List<String> employeeNames = employeeList1.stream().map(e->e.getName()).collect(Collectors.toList());
        System.out.println(employeeNames);
    }
    private static void flatMapOnStringObject()
    {
        List<String> list1 = new ArrayList<>(Arrays.asList("a","b"));
        List<String> list2 = new ArrayList<>(Arrays.asList("c","d"));
        List<List<String>> list3 = new ArrayList<>(Arrays.asList(list1,list2));
        List<String> list4 = list3.stream().flatMap(e->e.stream()).collect(Collectors.toList());
        System.out.println(list4.size());
        System.out.println(list4);
    }
    private static void flatMapOnEmployeeObject()
    {
        Employee e1= new Employee(1,"sachin");
        Employee e2=new Employee(2,"rahul");
        List<Employee> employeeList1 = new ArrayList<>(Arrays.asList(e1,e2));
        List<Employee> employeeList2=new ArrayList<>(Arrays.asList(e1,e2));

        List<List<Employee>> employeeList3 = new ArrayList<>(Arrays.asList(employeeList1,employeeList2));
        List<Employee> employeeList4= employeeList3.stream().flatMap(e->e.stream()).collect(Collectors.toList());
        System.out.println(employeeList4.size());
        System.out.println(employeeList4);
    }
}

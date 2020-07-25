package com.java.streams;

import com.java.common.Country;
import com.java.common.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsEmp {

    private static final Employee[] arrayOfEmps = new Employee[5];

    static {
        Employee e1 = new Employee(1, "name1", 300d);
        Employee e2 = new Employee(4, "name2", 250d);
        Employee e3 = new Employee(3, "name3", 1600d);
        Employee e4 = new Employee(2, "name4", 200d);
        Employee e5 = new Employee(5, "name4", 200d);
        arrayOfEmps[0] = e1;
        arrayOfEmps[1] = e2;
        arrayOfEmps[2] = e3;
        arrayOfEmps[3] = e4;
        arrayOfEmps[4] = e5;
    }

    public static void main(String[] args) {
//        createStream();
//        modifySalary();
        //     retrieveOnlySalary();
        //   filterByIdAndSalary();
       // groupBySalary();
      //  toMap();
     //   partitionBy();
     //   sortByNameTreeMap();
        filterByValuesListMap();
    }

    private static void filterByValuesListMap()
    {
        List<Map<String, String>> collData = new ArrayList<>();
        Map<String, String> stuMap = new HashMap<String, String>();
        stuMap.put("Sanjeev", "Course_1");
        stuMap.put("Sanjay", "Course_2");
        stuMap.put("Sandeep", "Course_1");
        stuMap.put("Alex", "Course_2");
        stuMap.put("Dumbo", "Course_1");
        stuMap.put(null, "College_A");
        collData.add(stuMap);

        stuMap = new HashMap<String, String>();
        stuMap.put("Dave", "Course_1");
        stuMap.put("Alex", "Course_2");
        stuMap.put("Dumbo", "Course_1");
        stuMap.put("Rohan", "Course_2");
        stuMap.put("Rohit", "Course_1");
        stuMap.put(null, "College_B");
        collData.add(stuMap);

        // filter where course is Course_1
        Object response  = collData.stream().map(e->{
            return e.entrySet().
                    stream().
                    filter(e1->{return e1.getValue().equals("Course_1");})
                    .collect(Collectors.toList());
        }).collect(Collectors.toList());

        System.out.println(response.getClass());
        System.out.println(response);

    }

    private static void sortByNameTreeMap()
    {

        List<Country> countries = new ArrayList();
        countries.add(new Country("India", "91"));
        countries.add(new Country("Pak", "92"));
        countries.add(new Country("America", "94"));
        countries.add(new Country("America", "95"));

        Function<Country, String> countryStringFunction = (c) -> {
            return c.getName();
        };
        Function<Country, String> codeStringFunction = (c) -> {
            return c.getCode();
        };



        Map<String, String> map = null;

        map = countries.
                stream()
                .collect(Collectors.toMap(countryStringFunction,
                        codeStringFunction,
                        (u, v) -> {
                            return v;
                        }, TreeMap::new));

        System.out.println(map);
    }

    // partition by even and odd empId
    private static void partitionBy() {
        Stream<Employee> s = Stream.of(arrayOfEmps);
        Map<Boolean, List<Employee>> partition = s.collect(Collectors.partitioningBy(e -> {
            return e.getId() % 2 == 0;
        }));

        displayStream(partition.entrySet().stream());
    }
    private static void toMap() {
        Stream<Employee> s = Stream.of(arrayOfEmps);

        Stream result = s.collect(Collectors.toMap(e -> {
            return e.getSalary();
        }, Function.identity(),(e1,e2)->{
            return e2; // to avoid duplicate key collision
        })).entrySet().stream();
        displayStream(result);
    }

    // multi value list for a key
    private static void groupBySalary() {
        Stream<Employee> s = Stream.of(arrayOfEmps);
        Stream result = s.collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream();
        displayStream(result);
    }

    private static void filterByIdAndSalary() {
        Stream<Employee> s = Stream.of(arrayOfEmps);
        s = s.filter(e ->
                e.getId() % 2 == 0
        ).filter(e -> e.getSalary() >= 100);

        displayStream(s);
    }

    private static void retrieveOnlySalary() {
        Stream<Employee> s = Stream.of(arrayOfEmps);
        List<Double> salaryList = s.map(e -> {
            return e.getSalary();
        }).collect(Collectors.toList());
        displayStream(salaryList.stream());
    }

    private static void modifySalary() {
        Stream<Employee> s1 = Stream.of(arrayOfEmps);
        s1.forEach(e -> {
            e.setSalary(40000d);
        });
        displayStream(Stream.of(arrayOfEmps));
    }

    private static void createStream() {
        Stream s1 = Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);
        Stream s2 = Stream.builder().add(arrayOfEmps[0]).add(arrayOfEmps[1]).add(arrayOfEmps[2]).build();
        Stream s3 = Arrays.stream(arrayOfEmps);
        displayStream(s1);
        displayStream(s2);
        displayStream(s3);
    }

    private static void displayStream(Stream s) {
        System.out.println("displaying: " + s);
        s.forEach(e -> {
            System.out.println(e);
        });
    }
}

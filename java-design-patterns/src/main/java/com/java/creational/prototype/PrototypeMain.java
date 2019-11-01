package com.java.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Employee e = EmployeeFactory.getEmployee(Company.FICO);
        System.out.println(e.hashCode());
        e=EmployeeFactory.getEmployee(Company.FICO);
        System.out.println(e.hashCode());
    }
}

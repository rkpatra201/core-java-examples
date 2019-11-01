package com.java.creational.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<Company, Employee> employeeMapCompanyName = new HashMap<>();

    static {
        // get fico emloyee template
        Employee ficoEmployee = getEmployeeTemplateForCompany(Company.FICO, 1965);
        // get TCS employee template
        Employee tcsEmployee = getEmployeeTemplateForCompany(Company.TCS, 1990);

        employeeMapCompanyName.put(Company.FICO, ficoEmployee);
        employeeMapCompanyName.put(Company.TCS, tcsEmployee);
    }

    private static Employee getEmployeeTemplateForCompany(Company company, int year) {
        System.out.println("creating employee template for : " + company.name());
        Employee employee = new Employee();
        employee.setCompanyName(company.name());
        employee.setCompanyEstdYear(year);
        return employee;
    }

    public static Employee getEmployee(Company company) {
        try {
            Employee e=  employeeMapCompanyName.get(company);
            Employee temp = (Employee) e.clone();
            return temp;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

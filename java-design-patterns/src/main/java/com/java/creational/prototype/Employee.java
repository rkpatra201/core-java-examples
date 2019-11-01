package com.java.creational.prototype;

public class Employee implements Cloneable {
    private int id;
    private String name;
    private String companyName;
    private int companyEstdYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyEstdYear() {
        return companyEstdYear;
    }

    public void setCompanyEstdYear(int companyEstdYear) {
        this.companyEstdYear = companyEstdYear;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyEstdYear=" + companyEstdYear +
                '}';
    }
}

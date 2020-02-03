package com.java.inheritance;

public class Dept03738 {
    public void display(Employee03738 e)
    {
        System.out.println("hi");
    }

    public void display(ContractEmployee03738 e)
    {
        System.out.println("bye");
    }

    public void show(IEmployee03746 e)
    {
        System.out.println("interface");
    }
    public void show(PermanentEmployee03746 e)
    {
        System.out.println("pe");
    }
    public void show(ContractEmployee03746 e)
    {
        System.out.println("ce");
    }

    public void show(Object o)
    {
        System.out.println("object");
    }
    public void show(String s)
    {
        System.out.println("string");
    }

}

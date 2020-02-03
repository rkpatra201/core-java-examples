package com.java.inheritance;

public class B030809 extends  A030809{

    protected  int i;
    public B030809(int i) {
        super(i);
    }

    public void display()
    {
        System.out.println(this.i);
        System.out.println(super.i);
    }
}

package com.java.creational.singleton;

public class CloneSingleton extends ParentSingleton{
    private static final CloneSingleton INSTANCE = new CloneSingleton();

    private CloneSingleton()
    {

    }

    public static CloneSingleton getINSTANCE() {
        return INSTANCE;
    }
    // mandatory to override the clone. else it will go to super.clone() and generate
    // another object. to test comment out clone() method below.

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone(); this will go to parent which creates new object.
       // solution 1
        return INSTANCE;
        // solution 2
      //  throw new CloneNotSupportedException("clone not supported for singleton class");
    }
}

class ParentSingleton implements Cloneable
{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

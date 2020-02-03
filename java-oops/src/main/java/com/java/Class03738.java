package com.java;

import com.java.inheritance.*;

public class Class03738 {
    public static void main(String[] args) {
        Dept03738 dept03738=new Dept03738();
        Employee03738 e = new Employee03738();
        dept03738.display(e);
        e= new ContractEmployee03738();
        dept03738.display(e);
        ContractEmployee03738 e1 = new ContractEmployee03738();
        dept03738.display(e1);

        IEmployee03746 ie = new PermanentEmployee03746();
        dept03738.show(ie);
        if(ie instanceof PermanentEmployee03746) {
            PermanentEmployee03746 pe = (PermanentEmployee03746) ie;
            dept03738.show(pe);
        }
        ie = new ContractEmployee03746();
        dept03738.show(ie);

        if(ie.getClass().isAssignableFrom(ContractEmployee03746.class))
        {
            ContractEmployee03746 ce = (ContractEmployee03746) ie;
            dept03738.show(ce);
        }

        dept03738.show("john");
        Object o = "string";
        dept03738.show(o);

    }
}

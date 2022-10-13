package com.complete.advanced2;
import java.util.*;

// Generic class
class CustomGeneric<F1,F2>{     // F1,F2 are custom user defined data types decided at runtime
    public String name;
    private F1 f1;
    private F2 f2;

    CustomGeneric(String name, F1 f1, F2 f2){
        this.f1 = f1;
        this.f2 = f2;
        this.name = name;
        System.out.println("\n"+this.name+"\n"+this.f1+"\n"+this.f2);
    }

    public F1 retF1(){return this.f1;}
    public F2 retF2(){return this.f2;}
}

public class Generics {
    public static void main(String[] args) {

        /*
            Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces
            Similar to cpp templates
            generics aim to reduce bugs and enhance type safety
            <TypeParameter> TypeParameter cannot be a primitive data type in java
        */

        // without generics
        {
            ArrayList al = new ArrayList();
            al.add('s');
            al.add(2);
            al.add(5.2f);

            int val1 = (int) ((char) al.get(0));  // this will not generate error but it will typecast string to integer, thus producing bugs i.e. giving ascii value of character
            int val2 = (int) al.get(1);  // we need to typecast everytime we access different data type.
            System.out.println(val1);
            System.out.println(val2);
            System.out.println(al);
        }

        // with generics
        {
            ArrayList<String> al = new ArrayList<>();
            al.add("s1");
            al.add("s2");
            al.add("s3");
            System.out.println(al);
        }

        // Generic class usecase
        {
            @SuppressWarnings({"unchecked","rawtypes"})
            CustomGeneric cg1 = new CustomGeneric("Custom", 0L, 5.8);
            System.out.println(cg1.retF1().getClass());
            System.out.println(cg1.retF2().getClass());
        }

    }
}
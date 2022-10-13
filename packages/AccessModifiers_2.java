package com.complete.packages;
import com.complete.packages.access.AccessModifiers_0;

public class AccessModifiers_2 extends AccessModifiers_0{
    public static void main(String[] args) {

        AccessModifiers_2 a0 =  new AccessModifiers_2();

        System.out.println(a0.pb);
        System.out.println(a0.prt);

        // different package, subclass : not allowed - private, default/no modifier
//        System.out.println(a0.pd);
//        System.out.println(a0.pvt);

    }
}

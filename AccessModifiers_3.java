package com.complete;
import com.complete.packages.access.AccessModifiers_0;

public class AccessModifiers_3 {
    public static void main(String[] args) {

        AccessModifiers_0 a0 = new AccessModifiers_0();

        System.out.println(a0.pb);

        // basically world as compared to package containing above class (AccessModifiers_0)
        // different package, different class : not allowed - protected, private, default/ no modifier
//        System.out.println(a0.prt);
//        System.out.println(a0.pd);
//        System.out.println(a0.pvt);

    }
}

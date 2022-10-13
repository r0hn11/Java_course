package com.complete.oop;

public class MultipleInheritance {
    public static void main(String[] args) {

        /*

        WHY MULTIPLE INHERITANCE IS NOT ALLOWED IN JAVA?
        - Multiple inheritance faces problems when there exist methods with same signature in both super classes.
        - Due to such problems, multiple inheritance is not supported in Java.
        - BUT, similar concept can be achieved using interfaces.
        - A class can implement multiple interfaces and extend a class at the same time

        Note :
        - Interfaces are significantly different than classes
        - An interface can only have constant fields, method signatures and default methods.
        - A class implementing an interface needs to declare methods not fields, fields are final (constant)
        - We can create reference of add interface but not and object.
            Interface i1 = new SubClass();   is allowed.
            Subclass i1 = new Interface();   is NOT allowed.
        - Interface methods are public by default.

        */

    }
}

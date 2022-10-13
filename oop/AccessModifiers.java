package com.complete.oop;

class Human{
    private String name;    // private
    protected double score; // protected
    public boolean alive;   // public
    int age;                // default
}

public class AccessModifiers {
    public static void main(String[] args) {

        // Access modifiers
        /*
            Access modifiers define where a property/method is accessible
            Types:
                1. Public
                2. Private
                3. Protected
                4. Default

            Scope of access modifiers:
                            within class        within package      outside package(subclass only)      outside package
            Public              Y                     Y                         Y                              Y
            Protected           Y                     Y                         Y                              N
            Default             Y                     Y                         N                              N
            Private             Y                     N                         N                              N

        */

        // private modifiers : used for props/methods that are not supposed to be changed directly.
        Human h1 = new Human();
//        h1.name = "Asl6an";  // not accessible as its private
        h1.age = 40;        // accessible as its default
        h1.alive = true;    // accessible as its public
    }
}

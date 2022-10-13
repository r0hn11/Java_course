package com.complete.advanced2;

// documentation : https://www.javatpoint.com/java-annotation

@FunctionalInterface
@SuppressWarnings("unused")
interface MyInterface{
    void method1();
    //void method2();
}

@SuppressWarnings({"unused"})
class Parent{
    public void greet(){
        System.out.println("Hello");
    }
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Hello there");
    }
    @Deprecated
    public void die(){
        System.out.println("...");
    }
}


public class Annotations {
    @SuppressWarnings({"deprecation", "unused"})
    public static void main(String[] args) {
        /*
            ANNOTATIONS :
                Used to provide extra information about a program
                They provide metadata to a class/method
            Commonly used annotations in java :
                @Override - confirms if a method is overridden an existing method
                @SuppressWarnings - used to suppress generated warnings by a compiler (e.g. using deprecated methods)
                @FunctionalInterface - a functional interface is an interface with a single abstract method
        */

        Child c = new Child();
        c.die();
    }
}

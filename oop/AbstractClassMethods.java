package com.complete.oop;

abstract class AbstractClass{
    abstract void walk();
    public void run(){
        System.out.println("Run");
    }
}

class ChildAbs1 extends AbstractClass{
    @Override
    void walk(){
        System.out.println("Walk");
    }
}

abstract class ChildAbs2 extends AbstractClass{
    int x;
}

public class AbstractClassMethods {
    public static void main(String[] args) {

        // Abstract method : A method without an implementation.
        /*
         Abstract class :
            A class containing abstract methods.
            Even a single method amongst 100 methods can make a class abstract.
            We cannot create an object of an abstract class.
            An abstract method is declared so that the child classes will modify them as required
            If the parent class has an abstract method then child must have the method overriding. If not then that child class must be declared abstract too.
        */

        // In case if you want to create object of an abstract class, we need to implement the abstract methods first
        AbstractClass a1 = new AbstractClass(){
            @Override
            void walk(){}
        };

        ChildAbs1 c1 = new ChildAbs1();
        c1.walk();

//        ChildAbs2 c2 = new ChildAbs2();       // not allowed unless abstract method is implemented

    }
}

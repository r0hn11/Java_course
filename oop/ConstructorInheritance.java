package com.complete.oop;

class Base{
    public Base(){
        System.out.println("Base");
    }
    public Base(int a){
        System.out.println("Base overloaded " + a);
    }
    public Base(int a, int b){
        System.out.println("Base overloaded " + (a+b));
    }
}

class Sub1 extends Base{
    public Sub1(){
//        super(50,20);      // this will go back to base class constructor with one argument and invoke it
        System.out.println("Derived 1");
    }
    public Sub1(int x, int y){
        super(x);
        System.out.println("Sub1 overloaded "+(x+y));
    }
}

class Sub11 extends Sub1{
    public Sub11(){
        System.out.println("Sub 11");
    }
    public Sub11(int x, int y, int z){
        super(x,y);
        System.out.println("Sub11 overload "+(x+y+z));
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {

        /*
        Constructor inheritance
            Base class constructor will run always before the child classes irrespective of the presence of a constructor in child classes.
            If no constructor is present in base class then child constructor are allowed to run.
        Constructor overloading and inheritance
            All base class constructors will be invoked
            If a base class overloaded constructor has arguments then it can be invoked using derived class object by using 'super' keyword inside derived class constructor
                In this case, if 'super' is not used then constructor with no arguments from base class will be invoked
        */

//        Base b = new Base();
//        Sub1 s1 = new Sub1();
        Sub11 s11 = new Sub11(3,6,10);
    }
}

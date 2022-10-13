package com.complete.oop;

interface ParentInterface{
    void meth1();
}
interface ChildInterface extends ParentInterface{
    void meth2();
}

class ParentClass implements ChildInterface{
    public void meth1(){}
    public void meth2(){}
}

public class InterfaceInheritance {
    public void main(String[] args){

        /*
            Interface inheritance :
                Interface inheritance is similar to class inheritance.
                If a class implements a child interface then, it needs to implement parent interface's methods.
        */

        ParentInterface p1 = new ParentClass();     // allowed. can access ParentInterface's methods
        ChildInterface p2 = new ParentClass();      // allowed. can access ChildInterface's methods
        ParentClass p3 = new ParentClass();

    }
}

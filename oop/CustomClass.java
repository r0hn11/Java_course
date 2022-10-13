package com.complete.oop;
import java.lang.String;

// custom class
class Person{
    String name;
    int age;
    void getDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}

public class CustomClass{
    public static void main(String[] args){

        // One java file can contain only one public class.
        // class is a blueprint for an object

        Person p1 = new Person();   // instantiating a new object of class Person
        p1.name = "Rohan";  // setting property
        p1.age = 21;
        p1.getDetails();    // calling member methods

        Person p2 = new Person();
        p2.name = "John";
        p2.age = 23;
        p2.getDetails();

    }
}

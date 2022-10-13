package com.complete.oop;
import java.util.List;
import java.util.ArrayList;

class Student{
    public String name;
    public double gpa;
    private List<Integer> lst = new ArrayList();

    public Student(){
        System.out.println("\nStudent constructor 1 invoked");
    }

    public Student(String name){
        System.out.println("Student constructor 2 invoked");
        this.name = name;
    }

    public Student(String name, double gpa){
        System.out.println("Student constructor 3 invoked");
        this.name = name;
        this.gpa = gpa;
    }

    public Student(int ...arr){
        System.out.println("Student constructor 4 invoked");
        for(int e:arr){
            this.lst.add(e);
        }
        for(int e:lst){
            System.out.print(e+" ");
        }
    }
}

public class Constructors {
    public static void main(String[] args) {

        // Constructors are member functions invoked as the object of a class is instantiated
        // Used to initialize the properties in a class.
        // Constructors have same name as the class name.
        // Return type of a constructor is always void, hence no return type is mentioned.

        Student s1 = new Student();

        // Constructor overloading : constructor overloading works same as function overloading. Constructors with diff arguments.

        Student s2 = new Student("Jack");
        System.out.println(s2.name);
        Student s3 = new Student("Rohan", 9.85);
        System.out.println(s3.name+"\t"+s3.gpa);
        Student s4 = new Student(2,4,6,8);
    }
}

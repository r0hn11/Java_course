package com.complete.oop;

class Grandfather{      // superclass
    public int age;
    public boolean alive;

    public Grandfather(){
        System.out.println("Grandfather");
    }

    public void setval(int age, boolean alive){
        this.age = age;
        this.alive = alive;
    }
    public void getval(){
        System.out.println(this.age+"\t"+this.alive);
    }
}

class Father extends Grandfather{       // subclass (extending superclass)
    public boolean employed;
    public int salary;

    public Father(){
        System.out.println("Father");
    }

    public void setval(int age, boolean alive, boolean employed, int salary){
        this.age = age;
        this.alive = alive;
        this.employed = employed;
        this.salary = salary;
    }

    @Override
    public void getval(){
        System.out.println(this.age+"\t"+this.alive+"\t"+this.employed+"\t"+this.salary);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // Inheritance: borrowing part properties/methods (depending on access modifiers) from an existing class
        /*
            Types of inheritance: (defined with c++ syntax)
            1. Single
                one subclass extends one superclass
                class Sub:Super
            2. Hierarchical
                one subclass act as a parent for other multiple subclasses
                class Sub1:extends Super
                class Sub2:extends Super
                class Sub11:extends Sub1
                class Sub12:extends Sub1
                class Sub21:extends Sub2
                class Sub22:extends Sub2
                (like a tree)
            3. Multiple
                one subclass extends other multiple subclasses
                class Subsub: sub1,sub2
            4. Multilevel
                one subclass extends another subclass the extends a superclass
                class Subsub:Sub
            5. Hybrid
                combination of different inheritances
                e.g. Hierarchical + Multipath/Hierarchical
                     Multilevel + Multiple/Hierarchical
            6. Multipath
                one subclass extends other multiple subclasses and the superclass as well
                class Subsub: Sub1,Sub2,Super

        */
        // Java does not support multiple,multipath,hybrid inheritance i.e. two superclasses for a subclass.

        System.out.println("Constructors :");
        Grandfather g1 = new Grandfather();
        Father f1 = new Father();
        System.out.println("Setters :");
        g1.setval(70,true);
        f1.setval(43, true, true,50000);
        System.out.println("Getters :");
        g1.getval();
        f1.getval();

    }
}

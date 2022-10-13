package com.complete.basics;

public class MethodOverloading {

    static void greet(){
        System.out.println("Hello");
    }

    static void greet(int a){
        String s = (a==1)?"Morning":"Night";
        System.out.println(s);
    }

    public static void main(String[] args) {

        // Method overloading is same method name but different functionalities of the same method.
        // An overloaded method can be defined multiple times with different arguments each time. e.g none, int, in[] etc.
        // Method overloading cannot be performed by changing return type of the method

        greet();
        greet(0);
    }
}

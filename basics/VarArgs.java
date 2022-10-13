package com.complete.basics;

public class VarArgs {

    static int sum(int ...arr){
        int result=0;
        for(int e: arr){
            result+=e;
        }
        return result;
    }

    // now at least one variable is compulsory so that code will throw error for no argument
    static int sum2(int init, int ...arr){
        int result=init;
        for(int e: arr){
            result+=e;
        }
        return result;
    }

    public static void main(String[] args) {
        // Var args: Variable arguments solve the problem of different arguments given to a method. e.g adding 2,3,4,5 numbers without method overloading
        // hence we use var args. (int ...arr) is used to get multiple arguments. All are packed in single array
        // method sum() can add as many numbers as you want even without method overloading
        // for no arguments, it will return the default return value.

        System.out.println(sum());
        System.out.println(sum(3));
        System.out.println(sum(3,9));
        System.out.println(sum(5,8,32));

//        System.out.println(sum2());       // error, at least one argument needed.
        System.out.println(sum2(0, 5,7,4));
    }
}

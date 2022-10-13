package com.complete.basics;

public class Methods {

    // call by value
    static int add(int a,int b,int c){		// a,b,c are called parameters and values passed inside main method are called arguments.
        return a+b+c;
    }
    static int fakeChange(int a){
        a--;
        return a;
    }

    public int x2 = 34;
    static int realChange(Methods m1){
        m1.x2++;
        return m1.x2;
    }

    // call by reference
    static double avg(int[] arr){
        int sum=0;
        for(int x: arr){
            sum+=x;
        }
        return (double)sum/arr.length;
    }
    static void arrChange(int[] arr){
        arr[0]=1000;
    }

    public static void main(String[] args){

        // Methods/functions are used to write a reusable code to be used for different values but same operation.
        // Follow DRY (do not repeat yourself) principle
        // Methods are used to separate logic block from main method for cleaner and readable code.
        /*
            Syntax:
                <access modifier> <static> <return type> <method name>{
                    // code
                    // return value;
                }
        */
        /*
            static keyword:
                Allows to associate a method with class instead of object of a class. Static data is shared by all objects.
                A method which can be called without creation of an object.
                A static method can be referenced from a static context only.
        */
        /*
            call by value : the variable is copied and passed hence original variable is not changed but the copy of that variable is changed
            call by reference : the address of a variable is passed so that the variable can be changed
                                ( In case of arrays and objects, the reference is passed by default. )
        */

        int[] arr ={2,4,5,6};
        System.out.println(add(5,4,7));
        System.out.println(avg(arr));

        // call by value example
        int x=5;
        System.out.println("Before: "+x);
        fakeChange(x);
        System.out.println("After: "+x);  // value remains unchanged

        // call by reference example
		
		Methods m1 = new Methods();
        System.out.println("Before: "+m1.x2);
        realChange(m1);
        System.out.println("After: "+m1.x2);  // value changes as object is passed to method

        System.out.println("Before: "+arr[0]);
        arrChange(arr);
        System.out.println("After: "+arr[0]);   // is changed as arrays are passed by reference by default. (value is changed, address is same as old.)

    }
}

package com.complete.basics;

public class Recursion {

    // recursive approach
    static int factorial(int n){
        int fac;
        if(n==0){fac=1;}
        else{fac=n*factorial(n-1);}
        return fac;
    }

    // iterative approach
    static int factorial2(int n){
        int prod =1;
        for(int i=1;i<=n;i++){
            if(n==0) return prod;
            prod*=i;
        }
        return prod;
    }

    static int fibSeries(int x){
        if(x==0 || x==1) return x;
        else{
            return fibSeries(x-1)+fibSeries(x-2);
        }
    }

    public static void main(String[] args) {

        // Recursive method is a method which calls itself unless the base condition is satisfied
        // If base condition never reaches then error is thrown for too much recursion and memory usage
        int f1 = factorial(7);
        int f2 = factorial2(7);
        System.out.println(f1);
        System.out.println(f2);

        for(int i=0;i<10;i++){
            System.out.print(fibSeries(i)+" ");
        }
    }
}
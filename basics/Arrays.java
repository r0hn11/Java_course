package com.complete.basics;

import java.sql.Array;

public class Arrays {
    public static void main(String[] args){

        // Array is a collection of similar data types.
        // Array indexing starts from 0 and ends at size-1

        // Initialization :

        // declaration and memory allocation then initialization
        int[] a0 = new int[2];   // array of 5 integers
        a0[0] = 5;
        a0[1] = 2;
        /*a0[2] = 0;    // index out of bound error*/

        // declaration then memory allocation
        int[] a1;
        a1 = new int[5];

        // declaration, memory allocation and initialization
        int[] a2 = {1,2,4,6,12};

        // Printing array
        for (int i=0;i<a2.length;i++){
            System.out.print(a2[i]+"\t");
        }
        System.out.println("\nReverse :");
        for (int i=a2.length-1;i>=0;i--){
            System.out.print(a2[i]+"\t");
        }

        // Methods :

        int[] i1 = {2,5,6};
        char[] c1 = {'a','b','c'};
        String[] s1 = {"str1","str2","str3"};
        float[] f1 = {1.5f, 12.9f};

        System.out.println("\nLength: "+a1.length);      // length of array

        // FOR EACH loop
        System.out.println("\nFor each :");
        for(int e:a2){
            System.out.print(e+"\t");
        }

    }
}

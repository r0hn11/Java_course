package com.complete.basics;

public class Loops {
    public static void main(String[] args) {

        // Loops are used to do repetitive task
        // if the condition never reaches then loop continues, knows as infinite loop

        // WHILE
        System.out.println("\nwhile");
        int n = 10;
        while(n!=0){    // check -> perform
            System.out.print(n+"\t");   // print then deduct
            n--;
        }

        // DO WHILE
        // do while runs at least once irrespective of condition.
        System.out.println("\n\ndo while");
        do{
            System.out.println("In");
        }while(false);      //despite being false, loop will run once at least

        int n2=0;
        do {
            n2++;
            System.out.print(n2+"\t");
        }while(n2<10);      // perform -> check

        // FOR
        // different syntax than while and do while. (initialize -> check -> update)

        System.out.println("\n\nfor");
        for(int i=1;i<=10;i++){
            System.out.print(i+"\t");
        }

        System.out.println();
        for(int i=0;i<=20;i++){
            if(i%2!=0) System.out.print(i+"\t");
        }
        System.out.println();
        for(int i=0;i<20/2;i++){        // notice change in condition
            System.out.print((2*i+1)+"\t");     // removing conditional
        }

        // infinite loop
//        while(true) {System.out.println("hi");}

    }
}

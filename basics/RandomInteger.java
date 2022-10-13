package com.complete.basics;

import static java.lang.Math.random;


public class RandomInteger {
    public static void main(String[] args) {

        int n=0;
        int max = 10;
        int min = 8;
        int range = max - min + 1;
        while(n!=20) {
            double x  = random();       // Math.random will generate a double between 0 to 1 hence mulitply by ranage and add minimum to it.
            System.out.println((int)(x*range)+min);
            n++;
        }

    }
}

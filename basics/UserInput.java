package com.complete.basics;
import java.util.Scanner;
import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		// import java.util.Scanner
		Scanner sc2 = new Scanner(System.in);		// import java.util.*
		java.util.Scanner sc3 =  new Scanner(System.in);	// using direct library
		
        System.out.print("Enter int: ");
        int n1 = sc.nextInt();    // integer input
        System.out.print("Enter float: ");
        float n2 = sc.nextFloat();    // float input
        System.out.println(sc.hasNextInt());    // checks if input is integer(or given type)
        System.out.println(sc.hasNextFloat());    // checks if input is integer(or given type)

        System.out.print("Enter string (no space): ");
        String s1 = sc.next();    // string input (whitespace termination)
        String s2 = sc.nextLine();    // string input (new line termination)
        System.out.println("\nInput:\n"+s1+'\n'+s2);


        // Scanner: java class for user input
        // n1: variable to store
        // new: create a new object of Scanner class
        // System.in: user input is keyboard input
    }
}

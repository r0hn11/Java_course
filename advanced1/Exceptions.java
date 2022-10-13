package com.complete.advanced1;

import java.util.*;

public class Exceptions{
	public static void main(String[] args){
		
		/*
		
		Exceptions :
			Exception is an event that occurs when a program is executed disrupting the normal flow of instructions.
			try...catch is used to detect exception and avoid crashing of program
			Types :
			1) Checked exception --> compile time exceptions (handled by compiler)
			2) Unchecked exception --> Run time exception
		
		Common exceptions :
			NullPointer Exception
			Arithmetic Exception
			ArrayIndexOutofBound Exception
			IllegalArgument Exception
			NumberFormat Exception
		
		*/
		
		// TRY CATCH BLOCK :
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter a: ");
			int a = sc.nextInt();
			System.out.print("Enter b: ");
			int b = sc.nextInt();
			int c = a/b;	// will generate error if b is zero. and will exit the rest code.
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e);		// this runs e.toString() method of class Exception by default
		}
		
		// HANDLING SPECIFIC EXCEPTIONS :
		
		int[] arr1 = new int[5];
		int[] arr2 = {13,24,53,14,50};
		
		try{
			System.out.print("Enter Index: ");
			int i = sc.nextInt();
			System.out.print("Enter Value: ");
			int v = sc.nextInt();
			arr1[i] = v;
			System.out.println("Array 2 value : "+arr2[i]);
			System.out.println("Division : "+(arr2[i]/v));
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayOutOfBoundException");
		}
		catch(InputMismatchException e){
			System.out.println("InputMismatchException");
		}
		catch(Exception ignored){}
		
		// NESTED TRY CATCH :
		// in nested try...catch, if an exception is caught by inner catch then outer catch is skipped.
		
		try{
			try{
				System.out.println(arr2[arr2.length+1]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ex 1 : ArrayIndexOutOfBoundsException");
			}
		}
		catch(Exception e){
			System.out.println("ex 2 : "+e);
		}
		
		System.out.println("End of code");
		
	}
}
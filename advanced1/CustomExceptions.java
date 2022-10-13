package com.complete.advanced1;
import java.util.Scanner;

// custom exceptions are created to enable user defined exceptions. This is done by extending Exception class
class MyExceptions extends Exception{
	@Override
	public String toString(){
		//return super.toString() +" _toString()";
		return " _toString()";
	}
	
	@Override
	public String getMessage(){
		//return super.getMessage() + " _getMessage()";
		return " _getMessage()";
	}
}

public class CustomExceptions{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x<0){
			try{
				throw new ArithmeticException("Custom Exception");		// in built exceptions can also be thrown
				//throw new MyExceptions();		// custom exception thrown
			}catch(Exception e){
				System.out.println(e);		// runs toString()
				System.out.println(e.toString());
				System.out.println(e.getMessage());
				e.printStackTrace();	// runs toString() and prints line number
			}
		}
		System.out.println("End of code");
	}
}
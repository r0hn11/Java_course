package com.complete.advanced2;
import java.util.Date;

public class DateClass{
	public static void main(String[] args){
		
		// documentation : https://docs.oracle.com/javase/8/docs/api/java/util/Date.html

	
		Date dt = new Date();		// returns current date & time in format `day month date hh:mm:ss timezone year`
		System.out.println(dt);
		System.out.println(dt.getTime());
		System.out.println(dt.getDate());
		System.out.println(dt.getMonth());
		System.out.println(dt.getYear());	// etc.
		
		// most of the methods of class Date are deprecated hence we use new methods of calendar class
	
	}
}
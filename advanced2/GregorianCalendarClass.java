package com.complete.advanced2;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarClass{
	public static void main(String[] args){
		
		// documentation : https://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html

		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1.getTime()+"\n");
		
		// new methods :
		System.out.println(c1.get(Calendar.DATE)+"\n");
		System.out.println(c1.get(Calendar.SECOND));
		System.out.println(c1.get(Calendar.MINUTE));
		System.out.println(c1.get(Calendar.HOUR));		// 12 hours
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));	// 24 hours
		
		// GregorianClanedarClass is a subclass of class Calendar.
		GregorianCalendar c2 = new GregorianCalendar();
		
		System.out.println(c2.isLeapYear(2025));
		
	}
}
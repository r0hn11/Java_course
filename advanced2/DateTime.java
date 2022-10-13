package com.complete.advanced2;

public class DateTime{
	public static void main(String[] args){
		
		/*
		
		DATE & TIME :
			java.time -> package in java8 onwards for time and date
			
		Storing date :
			A long data type which returns milliseconds passed since 1 Jan 1970
			to achieve greater accuracy milliseconds are recorded.
			All methods consider 1900 as a starting date.
			
		*/
		
		long ms = System.currentTimeMillis();
		double s = ms/1000;
		double m = s/60;
		double h = m/60;
		double d = h/24;
		double w = d/7;
		double y = d/365;
		
		System.out.println(ms);
		System.out.println(s);
		System.out.println(m);
		System.out.println(h);
		System.out.println(d);
		System.out.println(w);
		System.out.println(y);
		
		
		/* 
		max allowed values of a data type : 
			System.out.println(Long.MAX_VALUE);
			System.out.println(Double.MAX_VALUE);
			System.out.println(Integer.MAX_VALUE);
		*/
	}
}

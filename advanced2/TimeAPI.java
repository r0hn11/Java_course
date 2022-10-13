package com.complete.advanced2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TimeAPI{
	public static void main(String[] args){
	
	/*
	java.time package :
		Available from java 8
		Capable of storing nanoseconds
		Immutable values. cannot be changed using 
	*/
	
	// Commonly used classes from java.time
	
	LocalDate dt = LocalDate.now();
	LocalTime tm = LocalTime.now();
	LocalDateTime dtm = LocalDateTime.now();
	
	System.out.println(dt);
	System.out.println(tm);
	System.out.println(dtm);	// stores seconds(efficiency) and nanoseconds(accuracy)
	
	
	}
}
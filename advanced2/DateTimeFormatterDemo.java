package com.complete.advanced2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo{
	public static void main(String[] args){

	// documentation : https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		LocalDateTime dtm = LocalDateTime.now();
		System.out.println(dtm);	// default format

		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yy...");		// create an object and specify a format for formatting.
		// we can use predefined formatters instead of creating new format each time
		// documentation shows keywords used for formatting
		DateTimeFormatter df2 = DateTimeFormatter.ISO_DATE;

		String now1 = dtm.format(df1);	// format the existing date to specified format using formatter object
		String now2 = dtm.format(df2);	// format the existing date to specified predefined format
		System.out.println(now1);
		System.out.println(now2);
	
	
	}
}
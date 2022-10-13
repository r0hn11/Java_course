//package com.complete.advanced2;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass{
	public static void main(String[] args){
	
	// documentation : https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
	// timezone ids : https://docs.oracle.com/cd/E84527_01/wcs/tag-ref/MISC/TimeZones.html
	
	// dates in Calendar class are mutable, they can be changes using set methods (refer documentation)
	
		Calendar c1 = Calendar.getInstance();	// current timezone
		Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));	// specific timezone
		
		System.out.println(c1.getCalendarType()+"\n");
		
		// Timezone
		System.out.println(c1.getTimeZone()+"\n");
		System.out.println(c2.getTimeZone().getID()+"\n");
		System.out.println(c1.getTimeZone().getDefault()+"\n");
		
		String[] timezones = c1.getTimeZone().getAvailableIDs();
		for(String s: timezones){System.out.println(s);}
	
	}
}
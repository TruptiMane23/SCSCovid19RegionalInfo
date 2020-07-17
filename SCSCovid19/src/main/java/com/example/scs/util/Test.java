package com.example.scs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.scheduling.annotation.Scheduled;

public class Test {
	public static void main(String[] args) throws ParseException {

		/*
		 * SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");
		 * 
		 * Date d1 = sdfo.parse("2018-03-31"); Date d2 = sdfo.parse("2012-03-31");
		 * 
		 * System.out.println("Date1 : " + sdfo.format(d1));
		 * System.out.println("Date2 : " + sdfo.format(d2));
		 * 
		 * // Compare the dates using compareTo() if (d1.compareTo(d2) > 0) {
		 * 
		 * // When Date d1 > Date d2 System.out.println("Date1 is after Date2"); }
		 * 
		 * else if (d1.compareTo(d2) < 0) {
		 * 
		 * // When Date d1 < Date d2 System.out.println("Date1 is before Date2"); }
		 * 
		 * else if (d1.compareTo(d2) == 0) {
		 * 
		 * // When Date d1 = Date d2 System.out.println("Date1 is equal to Date2"); }
		 */
		
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = new GregorianCalendar();
	    c.set(Calendar.HOUR_OF_DAY, 0);
	    c.set(Calendar.MINUTE, 0);
	    c.set(Calendar.SECOND, 0);
	    Date d1 = c.getTime(); 

	    System.out.println("Date is ..." +  df.format(d1));
	    
	    if((df.format(d1)).equals("24-06-2020")) {
	    	 System.out.println("in");
	    } else {
	    	System.out.println("else ");
	    }
	}
}
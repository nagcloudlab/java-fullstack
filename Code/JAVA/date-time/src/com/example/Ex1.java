package com.example;

import java.util.Calendar;
import java.util.Date;

public class Ex1 {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		
		date.setMonth(5);
		
		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getHours());
		
		System.out.println(date.getTime());
		
		
		/*
		 *  design issues
		 *  --------------
		 *  
		 *  
		 *  => misleading information
		 *  => mutable fields
		 *  => difficult use concurrent appln
		 *  => difficult to work with different time-zones
		 * 
		 */
		
		
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.MONTH));
		
	}
	
}

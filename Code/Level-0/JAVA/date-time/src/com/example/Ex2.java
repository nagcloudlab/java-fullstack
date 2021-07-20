package com.example;

import org.joda.time.LocalDate;

public class Ex2 {
	
	public static void main(String[] args) {
		
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.dayOfMonth().get());
		System.out.println(localDate.monthOfYear().get());
		
	}

}

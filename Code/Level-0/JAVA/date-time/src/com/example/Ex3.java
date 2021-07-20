package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 *  time api  ( JDK 1.8 )
 *  
 *  	java.time.*;
 * 
 * 
 */

public class Ex3 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getMonth());
		System.out.println(date.getYear());

		LocalDate dob = LocalDate.of(1983, 10, 5);
		System.out.println(dob.getDayOfWeek());

		LocalTime localTime = LocalTime.now();

		LocalDateTime dateTime = LocalDateTime.now();
		
		String dateInput="12/01/2021";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate= LocalDate.parse(dateInput, formatter);
		
		System.out.println(localDate.getMonth());

	}

}

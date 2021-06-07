package com.dataTimeFunctions;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("dd:"+date.getDayOfMonth());
		System.out.println("mm:"+date.getMonthValue());
		System.out.println("YYYY:"+date.getYear());
		System.out.println("YYYY:"+date.getDayOfWeek());
		System.out.println();
		System.out.printf("%d-%d-%d",date.getDayOfMonth(),date.getMonthValue(),date.getYear());
		System.out.println();
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("Hour:"+time.getHour());
		System.out.println("minutes:"+time.getMinute());
		System.out.println("Seconds:"+time.getSecond());
	}

}

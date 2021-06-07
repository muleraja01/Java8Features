package com.dataTimeFunctions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Example4_Period {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dob = LocalDate.of(1998,9,17);
		LocalDate today = LocalDate.now();
		Period p=Period.between(dob, today);
		System.out.printf("Your age is %d year, %d months and %d days",p.getYears(),p.getMonths(),p.getDays());
		System.out.println();
		
	}

}

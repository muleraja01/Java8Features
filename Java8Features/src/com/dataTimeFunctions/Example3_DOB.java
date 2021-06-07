package com.dataTimeFunctions;

import java.time.LocalDateTime;
import java.time.Month;

public class Example3_DOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.of(1995,06,8,07,35,11);
		System.out.println(dt);
		System.out.println("Day You Born :"+dt.getDayOfWeek());
		System.out.println();
		System.out.println("Date After 6 months of DOB:"+dt.plusMonths(6));
		System.out.println("Date Before 6 months of DOB:"+dt.minusMonths(6));
	}

}

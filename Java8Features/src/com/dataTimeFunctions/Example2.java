package com.dataTimeFunctions;

import java.time.LocalDateTime;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println();
		System.out.printf("%d-%d-%d",dt.getDayOfMonth(),dt.getMonthValue(),dt.getYear());
		System.out.println();
		System.out.printf("%d-%d-%d-%d",dt.getHour(),dt.getMinute(),dt.getSecond(),dt.getNano());
		System.out.println();
	}

}

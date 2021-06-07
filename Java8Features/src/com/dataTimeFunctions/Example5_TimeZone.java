package com.dataTimeFunctions;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Example5_TimeZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ZoneId current = ZoneId.systemDefault();
		System.out.println(current);*/
/*		Set<String> all = ZoneId.getAvailableZoneIds();
		long count = all.stream().count();
		System.out.println("Total Zones:"+count);
		all.forEach(System.out::println);*/
		System.out.println();
		ZoneId zoneNewYork = ZoneId.of("America/New_York");
		ZonedDateTime dt = ZonedDateTime.now(zoneNewYork);
		System.out.println(dt);

	}

}

package com.streamCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example6Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Raja");
		ar.add("Rajani");
		ar.add("Pavan");
		ar.add("mrunal");
		System.out.println(ar);
		long count = ar.stream().filter(s->s.length()>5).count();
		System.out.println("Count for which have lenght is >5 :"+count);
		 long ar3 = ar.stream().map(s->s.toUpperCase()).count();
		System.out.println("Total Numbers:"+ar3);
	}

}

package com.streamCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Raja");
		ar.add("Rajani");
		ar.add("Pavan");
		ar.add("mrunal");
		System.out.println(ar);
		List<String> ar2 = ar.stream().filter(s->s.length()>5).collect(Collectors.toList());
		System.out.println(ar2);
		List<String> ar3 = ar.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ar3);
	}

}

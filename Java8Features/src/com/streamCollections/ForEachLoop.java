package com.streamCollections;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(1);
		ar.add(15);
		ar.add(4);
		ar.add(43);
		System.out.println(ar);
		//ar.stream().forEach(i->System.out.println(i));
		//ar.stream().forEach(System.out::println);
		Object[] obj = ar.stream().toArray();
		for(Object x:obj) {
			System.out.println(x);
		}
	}

}

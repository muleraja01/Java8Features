package com.streamCollections;

import java.util.ArrayList;

public class MinAndMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(1);
		ar.add(15);
		ar.add(4);
		ar.add(43);
		System.out.println(ar);
		Integer min = ar.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max = ar.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(max);
	}

}

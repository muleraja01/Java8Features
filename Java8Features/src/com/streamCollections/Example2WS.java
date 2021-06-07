package com.streamCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2WS {

	public static void main(String[] args) {
		//Program to read even number from arraylist and copy to other arrayList
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			ar1.add(i);
		}
		System.out.println(ar1);
		List<Integer> ar2 = ar1.stream().map(i->(i+i)).collect(Collectors.toList());
		System.out.println(ar2);

	}

}

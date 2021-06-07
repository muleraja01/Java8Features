package com.streamCollections;

import java.util.ArrayList;

public class Example2WoS {

	public static void main(String[] args) {
		// Program to read even number from arraylist and copy to other arrayList
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();

		for (int i = 1; i <= 20; i++) {
			ar1.add(i);
		}
		System.out.println(ar1);
		for (Integer x : ar1) {
			if (x % 2 == 0) {
				ar2.add(x);
			}
 		}
		System.out.println(ar2);
	}

}

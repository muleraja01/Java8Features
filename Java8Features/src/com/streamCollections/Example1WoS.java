package com.streamCollections;

import java.util.ArrayList;

public class Example1WoS {

	public static void main(String[] args) {
		// Program to create collection double each number in the existing list
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();

		for (int i = 1; i <= 20; i++) {
			ar1.add(i);
		}
		System.out.println(ar1);
		for (Integer x : ar1) {
			ar2.add(x+x);
		}
		System.out.println(ar2);
	}

}

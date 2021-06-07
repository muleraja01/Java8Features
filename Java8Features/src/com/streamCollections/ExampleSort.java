package com.streamCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(1);
		ar.add(15);
		ar.add(4);
		ar.add(43);
		System.out.println(ar);
		List<Integer> ar1 = ar.stream().sorted().collect(Collectors.toList());
		System.out.println(ar1);//default sorted-Ascending Order
		List<Integer> ar2 = ar.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println(ar2);//Descending order


	}

}

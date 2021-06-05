package com.collectionAPIs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortWL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(5);
		arr.add(0);
		arr.add(15);
		arr.add(89);
		arr.add(56);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);//Ascesnding Order
		/*Collections.reverse(arr);System.out.println(arr);*/
		Collections.sort(arr,(a,b)->-a.compareTo(b));//Descending Order
		System.out.println(arr);
		
	}

}


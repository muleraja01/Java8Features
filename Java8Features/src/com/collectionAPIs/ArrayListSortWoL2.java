package com.collectionAPIs;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortWoL2 {

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
		System.out.println(arr);
		Collections.reverse(arr);System.out.println(arr);
	}

}

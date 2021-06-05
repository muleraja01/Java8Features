package com.collectionAPIs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class mycomparator implements Comparator<Integer>{

@Override	
public int compare(Integer o1, Integer o2) {
	if(o1>o2)
		return -1;
	else if (o1<o2)
			return +1;
	else
		return 0;
		
}
}
public class ArrayListSortWoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(5);
		arr.add(0);
		arr.add(15);
		arr.add(89);
		arr.add(56);
	/*	System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		Collections.reverse(arr);System.out.println(arr);*/
		
		Collections.sort(arr,new mycomparator());
		System.out.println(arr);
	}

}


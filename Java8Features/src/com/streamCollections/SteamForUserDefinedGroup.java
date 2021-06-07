package com.streamCollections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamForUserDefinedGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s = Stream.of(2,4,6,8,10,11,13);
/*		List<Integer> ar1 = s.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ar1);
		List<Integer> ar2 = s.map(i->i+i).collect(Collectors.toList());
		System.out.println(ar2);*/
		s.forEach(System.out::println);
	}

}

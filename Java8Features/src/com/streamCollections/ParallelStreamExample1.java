package com.streamCollections;

import java.util.ArrayList;

import javax.xml.stream.events.Characters;

public class ParallelStreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ar=new ArrayList<Character>();
		generate(ar);
		long start1 = System.currentTimeMillis();
		System.out.println("-----------------Sequentials Stream---------------");
		ar.stream().forEach(System.out::println);
		long stop1 = System.currentTimeMillis();
		System.out.println("Total Time:"+(stop1-start1));
		
		long start2 = System.currentTimeMillis();
		System.out.println("-----------------Parallel Stream---------------");
		ar.stream().parallel().forEach(System.out::println);
		ar.stream().forEach(System.out::println);
		long stop2 = System.currentTimeMillis();
		System.out.println("Total Time for parallel:"+(stop2-start2));
		
	}
	public static void generate(ArrayList<Character> ar) {
		for(int i=97;i<=122;i++) {
			char c=(char)i;
			ar.add(c);
		}
	}

}

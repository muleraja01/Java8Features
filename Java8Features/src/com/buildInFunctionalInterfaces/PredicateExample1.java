package com.buildInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		// Program to check number is greater than 10?
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(11));
		System.out.println(p.test(4));
		
		//program to check string length is >4
		Predicate<String> p1=s->s.length()>4;
		System.out.println(p1.test("Raja"));
		System.out.println(p1.test("Automation"));
		
		//Program to check arrayList is empty or not
		ArrayList<String> ar = new ArrayList<String>();
		Predicate<ArrayList<String>> p2=(a)->a.isEmpty();
		System.out.println(p2.test(ar));
		
	}
	
}

package com.buildInFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		//p1->Given number is greater than 10?
		//p2-->is even number
		int x[]= {0,5,7,0,23,20,30,25,46,67,78,89};
		Predicate<Integer>p1=i->i>10;
		Predicate<Integer>p2=i->i%2==0;
		System.out.println("The number is greater than 10");
		m1(p1,x);
		System.out.println("The number which re even");
		m1(p1, x);
		System.out.println("The number which are greater Than 10 and even Number");
		m1(p1.and(p2),x);
		System.out.println("The number which are greater Than 10 OR even Number");
		m1(p1.or(p2),x);
	}
	
	public static void m1(Predicate<Integer> p,int x[]) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}

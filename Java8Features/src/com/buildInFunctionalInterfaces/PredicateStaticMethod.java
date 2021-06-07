package com.buildInFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p = Predicate.isEqual("RamRam");
		System.out.println(p.test("RamRam"));
		System.out.println(p.test("RajaRam"));
	}

}

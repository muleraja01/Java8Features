package com.buildInFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample1 {

	public static void main(String args[]) {
		Function<String, Integer>f=s->s.length();
		System.out.println(f.apply("RajaRam"));
		System.out.println(f.apply("Hello"));
		//program to count no of spaces in a string
		String str="banglore is a beautiful city";
		Function<String, Integer>f1=s->s.length()-s.replaceAll(" ", "").length();
		System.out.println(f1.apply(str));
	}
}

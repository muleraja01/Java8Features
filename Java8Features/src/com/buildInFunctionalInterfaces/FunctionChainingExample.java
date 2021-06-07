package com.buildInFunctionalInterfaces;

import java.util.function.Function;

public class FunctionChainingExample {

	
	/*
	 * Fuctionalchaining ------------------------- f1.andThen(f2); ---->first it
	 * will take f1 , result of f1 will be applied to f2 f1.compose(f2)------->
	 * first it will take f2, result of f2 will be applied to f1.
	 * 
	 */
	public static void main(String[] args) {
		Function <Integer, Integer>f1=i->i*i;
		Function <Integer, Integer>f2=i->i+i;
		System.out.println("Square of 2 "+f1.apply(2));
		System.out.println("Addtion of its own number "+f2.apply(2));
		
		System.out.println(f1.andThen(f2).apply(2)); //8
		System.out.println(f1.compose(f2).apply(2));//16

	}
}

package com.buildInFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample2 {

	public static void main(String[] args) {
		// Program to print names randomly from an array
		/*double r = Math.random();
		System.out.println(r*4);
*/
		
		Supplier<String> s=()->{
			String str[]= {"Raja","Ram","Pavan","mrunal","Rajani"};
			int x=(int)(Math.random()*5);
			return str[x];
		};
		System.out.println(s.get());
	}

}

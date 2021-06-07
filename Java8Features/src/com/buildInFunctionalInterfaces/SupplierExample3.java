package com.buildInFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample3 {

	public static void main(String[] args) {
		//Program to generate 6 digits OTP Password
/*		int i=(int)(Math.random()*10);
		System.out.println(i);*/
		Supplier<String>s=()->{
			String otp="";
			for(int i=1;i<=6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		/*
		 * Supplier<Integer>s=()->{
			return (int)(Math.random()*1000000);
		};
		 */
		System.out.println(s.get());
	}

}

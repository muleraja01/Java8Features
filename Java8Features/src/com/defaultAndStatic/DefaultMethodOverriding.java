package com.defaultAndStatic;

interface RBI1 {
	default void AadharCardLink() {
		System.out.println("Link Within a Year");
	}
}

public class DefaultMethodOverriding implements RBI1{
	//default Method overriden
	public void AadharCardLink() {
		System.out.println("my Own implementation for Aadhar Link");
		
	}
	
	public static void main(String[] args) {
		DefaultMethodOverriding d = new DefaultMethodOverriding();
		d.AadharCardLink();
	/*	
		RBI1 d=new DefaultMethodOverriding();
		d.AadharCardLink();*/
	}

}

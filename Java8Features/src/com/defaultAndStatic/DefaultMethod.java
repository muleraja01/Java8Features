package com.defaultAndStatic;


interface RBI{
	default void AadharCard() {
		System.out.println("Link Within a Year");
	}
}
public class DefaultMethod implements RBI{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod d = new DefaultMethod();
		d.AadharCard();
	}

}

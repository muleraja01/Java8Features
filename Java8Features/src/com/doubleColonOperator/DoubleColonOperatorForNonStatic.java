package com.doubleColonOperator;


interface interf2{
	public void m1();
}
public class DoubleColonOperatorForNonStatic {
	public void m2() {
		System.out.println("Lamnda Implementaion For static...");
	}
	public static void main(String[] args) {
		interf2 i=new DoubleColonOperatorForNonStatic()::m2;
		i.m1();

	}

}

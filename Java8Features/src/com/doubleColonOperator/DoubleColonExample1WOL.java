package com.doubleColonOperator;

interface interf1{
	public void m1();
}
public class DoubleColonExample1WOL {

	public static void m2() {
		System.out.println("Lamnda Implementaion");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf1 i=DoubleColonExample1WOL::m2;
		i.m1();

	}

}

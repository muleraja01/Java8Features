package com.lamdaExpression;


interface sq{
	public int squareNum(int a);
}
public class Test3WithLamda {
	public static void main(String[] args) {
		sq i=a-> a*a;
		int snum=i.squareNum(2);
		System.out.println(snum);
	}
}

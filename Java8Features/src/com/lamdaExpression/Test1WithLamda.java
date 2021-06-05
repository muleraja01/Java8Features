package com.lamdaExpression;

interface Interf1 {
	public void add2(int a, int b);
}
public class Test1WithLamda {
	
public static void main(String[] args) {
	Interf1 i=(a,b)->System.out.println("Addition of two Numbers:"+(a+b));
	i.add2(15, 30);
	i.add2(45, 30);
}

}

package com.lamdaExpression;

interface Interf {
	public void add2(int a, int b);
}

class Demo implements Interf {
	public void add2(int a, int b) {
		System.out.println("Addition of two numbers:" + (a + b));
	}

}
public class Test1WithOutLamda {
	public static void main(String[] args) {
		Interf i = new Demo();
		i.add2(10, 20);
		i.add2(15, 20);
	}
}

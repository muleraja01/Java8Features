package com.lamdaExpression;


interface C{
	public int strlen(String s);
}
public class Test2WithLamda {

	public static void main(String[] args) {
		C i=s->s.length();
		int len = i.strlen("Hello Word");
		System.out.println(len);
		int len2 = i.strlen("Automation Testing using Selenium");
		System.out.println(len2);

	}

}

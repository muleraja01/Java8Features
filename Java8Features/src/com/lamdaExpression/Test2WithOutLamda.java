package com.lamdaExpression;


interface p{
	public int strlen(String s);
}

class Demoreturn implements p{

	@Override
	public int strlen(String s) {
		return s.length();
	}
	
}
public class Test2WithOutLamda {

	public static void main(String[] args) {
		p i=new Demoreturn();
		int len = i.strlen("Hello");
		System.out.println(len);
		int len2 = i.strlen("The weather is 43%");
		System.out.println(len2);

	}

}

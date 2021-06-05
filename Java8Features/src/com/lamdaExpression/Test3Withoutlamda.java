package com.lamdaExpression;

@FunctionalInterface
interface intersqaure{
	public int squarenum(int a);
}
public class Test3Withoutlamda implements intersqaure{

	public static void main(String[] args) {
		intersqaure i=new Test3Withoutlamda();
		int snum=i.squarenum(3);
		System.out.println(snum);
	}
	
	public int squarenum(int a) {
		return a*a;
	}

}

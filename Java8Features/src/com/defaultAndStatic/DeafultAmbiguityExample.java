package com.defaultAndStatic;

interface left {
	default void m1() {
		System.out.println("Left implementation");
	}
}

interface right {
	default void m1() {
		System.out.println("Right implementation");
	}
}

public class DeafultAmbiguityExample implements left, right {

	public void m1() {
		// System.out.println("Own Implementation");
		// left.super.m1();
		right.super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeafultAmbiguityExample d = new DeafultAmbiguityExample();
		d.m1();
	}

}

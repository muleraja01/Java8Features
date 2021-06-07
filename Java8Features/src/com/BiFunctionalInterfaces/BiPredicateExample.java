package com.BiFunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// Program to check whether addition if two numbers is even or not
		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bp.test(10, 11));
		System.out.println(bp.test(3, 9));
		System.out.println();
		// BiFunctionExample
		// program to return product of two numbers
		BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
		System.out.println(f.apply(10, 11));
		System.out.println(f.apply(3, 9));
		System.out.println();
		// BiConsumer
		// program to conncatinate two strings

		BiConsumer<String, String> c = (str1, str2) -> System.out.println(str1 + str2);
		c.accept("Ram", "Raj");

	}

}

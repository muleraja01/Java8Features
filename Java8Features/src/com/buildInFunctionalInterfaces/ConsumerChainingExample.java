package com.buildInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Studentinfo {
	String name;
	int marks;

	Studentinfo(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
public class ConsumerChainingExample {

	

	public static void main(String[] args) {
		// program where I can user predicate,Function and consumer
		// Program to print all student inforamtion having making marks greater than or
		// equal to 60
		ArrayList<Studentinfo> ar = new ArrayList<Studentinfo>();
		populate(ar);
		Predicate<Studentinfo> p = s -> s.marks >= 60;
		Function<Studentinfo, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80)
				return "A[Distinction]";
			else if (marks >= 60)
				return "B[Firstclass]";
			else if (marks >= 50)
				return "C[Secondclass]";
			else if (marks <= 35)
				return "D[Fail]";
			else
				return "Invalid entry";

		};
		Consumer<Studentinfo> c = s -> {
			System.out.println("Student name:" + s.name);
			System.out.println("Student marks :" + s.marks);
			System.out.println("Grade:" + f.apply(s));
			System.out.println();
		};

		for (Studentinfo x : ar) {
			if (p.test(x)) {
				c.accept(x);
			}
		}
	}

	
	public static void populate(ArrayList<Studentinfo> ar){
		ar.add(new Studentinfo("Raja",60));
		ar.add(new Studentinfo("mrunal",40));
		ar.add(new Studentinfo("rajani",76));
		ar.add(new Studentinfo("pavan",16));
		ar.add(new Studentinfo("sri",85));
	}


}

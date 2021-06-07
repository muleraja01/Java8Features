package com.buildInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Studentinfo1 {
	String name;
	int marks;

	Studentinfo1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
public class ConsumerExmaple2 {

	

	public static void main(String[] args) {
		// program where I can user predicate,Function and consumer
		// Program to print all student inforamtion having making marks greater than or
		// equal to 60
		ArrayList<Studentinfo1> ar = new ArrayList<Studentinfo1>();
		populate(ar);
		Predicate<Studentinfo1> p = s -> s.marks >= 60;
		Function<Studentinfo1, String> f = s -> {
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
		Consumer<Studentinfo1> c = s -> {
			System.out.println("Student name:" + s.name);
			System.out.println("Student marks :" + s.marks);
			System.out.println("Grade:" + f.apply(s));
			System.out.println();
		};
		Consumer<Studentinfo1> c1=s->{
			System.out.println("Eligible for IAS Exam");
			System.out.println();
		};

		for (Studentinfo1 x : ar) {
			if (p.test(x)) {
				c.andThen(c1).accept(x);
			}
		}
	}

	
	public static void populate(ArrayList<Studentinfo1> ar){
		ar.add(new Studentinfo1("Raja",60));
		ar.add(new Studentinfo1("mrunal",40));
		ar.add(new Studentinfo1("rajani",76));
		ar.add(new Studentinfo1("pavan",16));
		ar.add(new Studentinfo1("sri",85));
	}


}

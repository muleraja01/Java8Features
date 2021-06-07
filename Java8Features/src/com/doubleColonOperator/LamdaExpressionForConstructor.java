package com.doubleColonOperator;


interface intr{
	public Sample get();
}
class Sample{
	Sample(){
		System.out.println("Sample Constructor");
	}
}

public class LamdaExpressionForConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intr i=()->new Sample();
		i.get();
	}

}

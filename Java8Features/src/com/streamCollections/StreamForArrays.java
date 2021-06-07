package com.streamCollections;

import java.util.stream.Stream;

public class StreamForArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d[]= {0.1,10.3,13.2,4.4,5.4,5.6};
		Stream<Double> s = Stream.of(d);
		s.forEach(i->System.out.println(i));
	}

}

package javaStreamConcept;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Integer[] i = {4,5,7,8,9,0};
		Stream.of(i).forEach(System.out::println);
	}

}

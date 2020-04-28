package javaStreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BasicIntro {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(25);
		l.add(30);
		
		List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		// creat a list where every element is double the given list
		List<Integer> l2 = l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
		

	}

}

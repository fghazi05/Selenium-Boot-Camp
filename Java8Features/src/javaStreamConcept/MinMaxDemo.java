package javaStreamConcept;

import java.util.ArrayList;

public class MinMaxDemo {

	public static void main(String[] args) {
    ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(0);
		l.add(20);
		l.add(15);
		l.add(10);
		l.add(5);
		System.out.println(l);
		
		int min = l.stream().min((l1,l2)->l1.compareTo(l2)).get();
		System.out.println(min);
		
		int max = l.stream().max((l1,l2)->l1.compareTo(l2)).get();
		System.out.println(max);
		
		int min1 = l.stream().min((l1,l2)->-l1.compareTo(l2)).get();
		System.out.println(min1);
		
		int max1 = l.stream().max((l1,l2)->-l1.compareTo(l2)).get();
		System.out.println(max1);

	}

}

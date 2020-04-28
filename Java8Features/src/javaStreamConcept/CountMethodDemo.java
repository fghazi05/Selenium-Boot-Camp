package javaStreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountMethodDemo {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(67);
		marks.add(35);
		marks.add(50);
		marks.add(60);
		marks.add(20);
		marks.add(0);
		marks.add(25);
		
		long noOfFailedStudents = marks.stream().filter(m->m<35).count();
		System.out.println(noOfFailedStudents);
		
		// sorted()
		
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		// using Comparator
		List<Integer> sortedList1 = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		// sorted() using Comparable Interface
		List<Integer> sortedList2 = marks.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedList2);
		

	}

}

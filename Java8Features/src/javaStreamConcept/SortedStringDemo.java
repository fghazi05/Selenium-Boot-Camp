package javaStreamConcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStringDemo {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Faiza");
		l.add("Hassan");
		l.add("Dua Sadek");
		l.add("Ayesha");
		l.add("Hira");
		//Natural Order
		List<String> sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
       // reverse natural order or descending order
		List<String> sortedList1 = l.stream().sorted((s1,s2)->(-s1.compareTo(s2))).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		//To sort according to increasing length order
		Comparator<String> c = (s1,s2)->{
			
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1>l2) return -1;
			else if(l1<l2) return 1;
			else  return (s1).compareTo(s2);
		};
		
		List<String> sortedList2 = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList2);
		
		
		
	}

}

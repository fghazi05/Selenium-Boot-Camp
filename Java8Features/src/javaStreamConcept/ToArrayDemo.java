package javaStreamConcept;

import java.util.ArrayList;

public class ToArrayDemo {

	public static void main(String[] args) {
		 ArrayList<Integer> l = new ArrayList<Integer>();
			
			l.add(0);
			l.add(20);
			l.add(15);
			l.add(10);
			l.add(5);
			System.out.println(l);
			// I want to convert this list of objects into an Array using stream
			//I have to create the array object and that array object i have to pass
			// Integer[]:: new is going to return Integer object
			
			Integer[] i = l.stream().toArray(Integer[]:: new);
			 for(Integer i1 :l) {
				 System.out.println(i1);
			 }
				 

	}

}

package assignment_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListOfIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(200);
		l.add(105);
		l.add(4);
		l.add(5);
		l.add(222);
		l.add(7);
		
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext()) {
			Integer i = (Integer)ltr.next();
		    if(i>100) {
			
			ltr.remove();
		}
		   
		
	}
		 System.out.println(l);
}
}
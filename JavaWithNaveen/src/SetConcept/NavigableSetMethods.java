package SetConcept;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {
	
	public static void main(String[] args) {
		
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		ns.add(7);
		ns.add(8);
		
		// get the reverse view of NavigableSet
		  NavigableSet<Integer> revorder= ns.descendingSet();
				
		  System.out.println("Normal order" + ns);
		  System.out.println("Reverse order" + revorder);
		  
		  NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
		  
		  System.out.println("Three or more"+ threeOrMore);
		  
		  System.out.println("Lower(3)" + ns.lower(3));
		  System.out.println("Higher(3)" + ns.higher(3));
		  System.out.println("Ceiling(3)" +  ns.ceiling(3));
		  System.out.println("Floor(3)" + ns.floor(3));
		  
		  System.out.println("pollFirst(): " + ns.pollFirst()); 
	      System.out.println("Navigable Set:  " + ns); 
	  
	      System.out.println("pollLast(): " + ns.pollLast()); 
	      System.out.println("Navigable Set:  " + ns); 
	}

}

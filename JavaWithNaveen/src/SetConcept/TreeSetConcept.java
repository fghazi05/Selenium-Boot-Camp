package SetConcept;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetConcept {
	
	public static void main(String[] args) {
		
		SortedSet set = new TreeSet();
		
		set.add("b");
		set.add("d");
		set.add("e");
		set.add("a");
		
		 Iterator it = set.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

	

}

package listConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		 
		LinkedList<String> ll = new LinkedList<String>();
		// add
		ll.add("Tara");
		ll.add("Sara");
		ll.add("Kiran");
		ll.add("Dua");
		
		 // print
		System.out.println(ll);
		
		// add first
		
		ll.addFirst("Emaan");
		
		// add last
		ll.addLast("Irfan");
		System.out.println("Content of linked list" +ll);
		
		// get
		System.out.println(ll.get(0));
		
		// set
		ll.set(1, "Tom");
		System.out.println(ll);
		
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		 System.out.println(ll);
		 
		 ll.remove(2);
		 System.out.println(ll);
		 
		 // how to print all the values of linked list:
		 // 1. for loop
		 
		 System.out.println("***** using for loop");
		 
		 for(int n =0; n<ll.size(); n++) {
			 System.out.println(ll.get(n));
			 
		 }
		 // 2. Advance for loop
		 
		 System.out.println("********using advance for loop");
		 
		 for(String str : ll) {
			 System.out.println(str);
		 }
		 
		 // 3. Iterator
		 
		 System.out.println("********using Iterator");
		 
		 Iterator<String> it = ll.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 
		 // 4. while loop
		 
		 System.out.println("********using while loop");
		 
		 int num =0;
		 while(num<ll.size()) {
			 System.out.println(ll.get(num));
			 num++;
		 }
		

	}

}

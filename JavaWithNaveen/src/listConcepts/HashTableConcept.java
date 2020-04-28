package listConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		// 1. it is similar to hasmap but it is synchronized
		// 2. Stores the values in key-value format
		// 3. Key--> Object-->Hashcode-->value
		// the key will be specified as an object and that object has one unique hashcode and in that particular hashcode the value will be stored
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Tom");
		h1 .put(2, "Tara");
		h1.put(3, "Java");
		
		// create clone copy/shallow copy
		
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable) h1.clone();
		
		System.out.println("values from h1  "+  h1);
		System.out.println("values from h2  "+  h2);
		
		h1.clear();
		
		System.out.println("values from h1  "+  h1); // values from h1 are removed but values of h2 are still there
		System.out.println("values from h2  "+  h2);
		
        // create contains value
		
		Hashtable st = new Hashtable();
		st.put("A" , "Tara");
		st.put("B", "Java");
		st.put("C", "Manager");
		
		if(st.containsValue("Tara"));
		System.out.println("st contains the value");
		
		// To print all the values from hashtable using----Enumeration---Elements()
		System.out.println("To print all the values from hashtable using Enumeration");
		
		
		Enumeration e = st.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		//get all the values from hashtable using-----entrySet----all the elements of hashtable
		System.out.println("To print all the values from hashtable using entrySet");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		//to compare if two hashtables are equal or not
		Hashtable st1 = new Hashtable();
		st1.put("A" , "Tara");
		st1.put("B", "Java");
		st1.put("C", "Manager");
		
		st.equals(st1);
		System.out.println("Both are equal");
		
		//get the value from a key
		System.out.println(st1.get("A"));
		
		//get hashcode of hashtable object
		System.out.println("The hashcode value of st1 : "+ st1.hashCode());
		
		// null keys and null values are not allowed
		// st1.put("A", "null") it will give null pointer error. But in hash map its allowed
		
		// generics can also be used as follows
		
		Hashtable<String,String> h3 = new Hashtable<String, String>();
		
		
		
		
		
	}

}

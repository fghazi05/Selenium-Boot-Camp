package listConcepts;

import java.awt.RenderingHints.Key;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMapConcept {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		
		// 1. Hash Map is a class that implements Map Interface
		// 2. extends abstractMap class
		// 3. it contanis only unique elements
		// 4. it stores data in the key value pair
		// 5. it may have one null key and multiple null values
		// 6. it maintains no order
		// 7. It is non-synchronized
		
		hm.put(0, "Selenium");
		hm.put(1, "QTP");
		hm.put(2, "Java");
		hm.put(3, "Jenkins");
		
		// to access any value by the key
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		// to iterate through all the values of map
		
		for(java.util.Map.Entry<Integer, String> m : hm.entrySet()) {
			
			System.out.println(m.getKey()+ "   " +m.getValue());
			
		}
		// remove 
		hm.remove(3);
		System.out.println(hm);
		
		//To store object of user defined class in HashMap
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Tom", 25, "QA");
		Employee e2 = new Employee("Dua", 26, "Dev");
		Employee e3 = new Employee("Peter", 27, "Admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		
		for(java.util.Map.Entry<Integer, Employee> m : emp.entrySet()) {
			int k = m.getKey();
			Employee e = m.getValue();
			
			System.out.println("Employee "+ k  + "    Info :");
			
			System.out.println(e.name + " " + e.age + "  " + e.dept);
		}
				
				
		
		
		
		
		
		
	}

}

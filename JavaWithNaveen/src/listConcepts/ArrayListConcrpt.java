package listConcepts;

import java.util.*;

public class ArrayListConcrpt {
	public static void main(String[] args) {
		
		int a[] = new int[3]; //static array---size is fixed
		
		ArrayList ar = new ArrayList();
		
		//  Dynamic Array ---Array list
		// 1. Can contain duplicate values/elements
		// 2. Insertion order is maintained
		// 3. Synchronized
		// 4. Allows random access to fetcch the values because the elements are stored on the basis of indexes
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());   // to find the size of the Array list
		System.out.println(ar.get(4));   // To access the value stored at index 4
		
		System.out.println("********************************************");
		
		//  To print all the values from arraylist:
		//  1. for loop
		//  2. Iterater
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
			
			 
			// Non generic VS generic
			
			ArrayList<Integer> ar1 = new ArrayList<Integer>();
			ar1.add(100);
			
			
			ArrayList<String> ar2 = new ArrayList<String>();
			ar2.add("test");
			System.out.println("********************************************");
			
			// To save user defined class objects in ArrayList
			
			ArrayList<Employee> ar3 = new ArrayList<Employee>();
			
			//Employee class objects
			
			Employee e1 = new Employee("Peter", 27, "QA");
			Employee e2 = new Employee("Tara", 28, "BA");
			Employee e3 = new Employee("Sara", 29, "Dev");
			
			ar3.add(e1);
			ar3.add(e2);
			ar3.add(e3);
			 
			// iterator to traverse the values
			
			Iterator<Employee> it = ar3.iterator();
			
			while(it.hasNext()) {
				Employee emp = it.next();
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
				
			}
			System.out.println("********************************************");
			
			//addAll()
			
			ArrayList<String> ar4 = new ArrayList<String>();
			ar4.add("Karachi");
			ar4.add("Paris");
			ar4.add("Chicago");
			
			ArrayList<String> ar5 = new ArrayList<String>();
			ar5.add("New York");
			ar5.add("Michigan");
			ar5.add("Los Angeles");
			
			ar4.addAll(ar5);
			 
			for(int j =0; j< ar4.size(); j++) {
				System.out.println(ar4.get(j));
			}
			System.out.println();
			
			
		}   
		
	}
	

}

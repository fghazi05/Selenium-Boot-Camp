package lamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1{
	String name;
	int empNo;
	
	public Employee1(String name, int empNo) {
		this.name = name;
		this.empNo = empNo;
	}
	
	public String toString() {
		return name+ ":"+ empNo ;
		
	}
	
	
}

public class InnerClassDemo {

	public static void main(String[] args) {
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		l.add(new Employee1("Faiza", 7239876));
		l.add(new Employee1("Dua", 5274747));
		l.add(new Employee1("Emaan", 773225));
		l.add(new Employee1("Sara", 2366768));
		l.add(new Employee1("Saima", 267859));
		System.out.println(l);
		
		//if I want all these elements in sorting order then I will use Collections
		// based on ascending order of Employee number 
		
		Collections.sort(l, (l1,l2)-> (l1.empNo<l2.empNo)?-1:(l1.empNo>l2.empNo)?1:0);
		System.out.println(l);
		
		// sort based on alphabetical order of employee names.
		// to compare two strings in alphabetical order we use compareTo method of Comparable 
		// s1.compareTo(s2) ===> alphabetical order
		
		Collections.sort(l,(l1,l2) ->l1.name.compareTo(l2.name));
		System.out.println(l);
		

	}

}

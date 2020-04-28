package lamdaExpression;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee2{
	String name;
	double salary;
	
	Employee2(String name , double salary){
		this.name = name;
		this.salary = salary;
	}
}

public class BiConsumerDemo {

	public static void main(String[] args) {
		ArrayList<Employee2> l = new ArrayList<Employee2>();
		populate(l);
		BiConsumer<Employee2, Double> c = (e,d)->e.salary=e.salary+d;
		for(Employee2 e :l) {
		c.accept(e, 500.0);
	}
		for(Employee2 e :l) {
			System.out.println("Employee Name :" + e.name);
			System.out.println("Employee Salary :" + e.salary);
			System.out.println();
		}
}
		public static void populate(ArrayList<Employee2> l) {
			l.add(new Employee2("Faiza", 1000));
			l.add(new Employee2("Dua", 2000));
			l.add(new Employee2("Emaan", 3000));
			l.add(new Employee2("Kay", 4000));
			l.add(new Employee2("Kiran", 5000));
			
		}
		

	}

	
		
	



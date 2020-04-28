package lamdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	
	String name;
	double salary;
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
}

public class PredicateDemo2 {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Faiza",1000));
		l.add(new Employee("Tara",2000));
		l.add(new Employee("Dua",3000));
		l.add(new Employee("Emaan",4000));
		l.add(new Employee("Hira",5000));
		l.add(new Employee("Sarah",6000));
		
		Predicate<Employee> p = e->e.salary>3000;
		
		for(Employee e1 : l) {
			if(p.test(e1)){
				System.out.println(e1.name +":"+ e1.salary);
			}
		}
		
		

	}

}

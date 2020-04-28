package lamdaExpression;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee3{
	int empno ;
	String name;
	
	Employee3(int empno, String name){
		this.empno= empno;
		this.name = name;
	}
}

public class BiFunctionDemo {

	public static void main(String[] args) {
		ArrayList<Employee3> l = new ArrayList<Employee3>();
		
		BiFunction<Integer, String, Employee3> f = (empno,name)->new Employee3(empno,name);
		
		l.add(f.apply(100, "Faiza"));
		l.add(f.apply(200, "Dua"));
		l.add(f.apply(300, "Emaan"));
		l.add(f.apply(400, "Kay"));
		l.add(f.apply(500, "Sarah"));
		for(Employee3 e :l) {
			System.out.println("Employee Number " + e.empno);
			System.out.println("Employy Name " + e.name);
			System.out.println();
		}
		

	}

}

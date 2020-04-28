package lamdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}




public class FunctionDemo {

	public static void main(String[] args) {
//		Function<String,String> f = s->s.toUpperCase();
//		System.out.println(f.apply("Faiza"));
		
		Function<Student,String> f = s-> {
			int marks = s.marks;
			String grade = "";
			if(marks>= 80) grade = "A[Distiction]";
			else if(marks>= 60) grade = "B[First Class]";
			else if(marks>= 50) grade = "C[Second Class]";
			else if(marks>= 35) grade= "D[Third Class]";
			else grade = "F[Failed]";
			return grade;
		};
		
		Predicate <Student> p = s-> s.marks>=60;     //add this step if I want to check this condition marks>= 60
		
		Student[] s = {new Student("Faiza", 100),
				       new Student("Dua", 65),
				       new Student("Emaan", 55),
				       new Student("Tara", 45),
				       new Student("Sarah", 35),
				       new Student("Kiran", 25),
		};
		for(Student s1 : s) {
			
			if(p.test(s1)) {                        //add this step if I want to check this condition marks>= 60
			System.out.println("Student Name:  " + s1.name);
			System.out.println("Student Marks:  "  + s1.marks);
			System.out.println("Student Grade:  "  + f.apply(s1));
			
			System.out.println();
		}
			
		}   
	}

}

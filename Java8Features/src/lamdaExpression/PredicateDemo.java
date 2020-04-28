package lamdaExpression;

import java.util.function.Predicate;

//class MyPredicate implements Predicate<Integer>{    // To find if given integer is even or not
//	public boolean test(Integer I) {
//		if(I%2==0) { 
//			return true;
//		}
//			else {
//				return false;
//				
//		}
//	}
//
//	
//}
//To call above code as lambda expression 

//public class PredicateDemo {
//
//	public static void main(String[] args) {
//		
//		Predicate<Integer> p1 = I-> I%2==0;
//		System.out.println(p1.test(10));
//		System.out.println(p1.test(15));
//				
//		
//
//	}
//
//}

//To check if an employee has salary>1000  and he has a girl friend
//public class PredicateDemo {
//
//	public static void main(String[] args) {
//		
//		Predicate<Employee> p1 = e-> e.salary.1000 && e.isHavingGF==true;
//		
//		System.out.println(p1.test(e));
//
//
//	}
//}	
// Write a Predicate to check if length of a string >5 or not

 class PredicateDemo{
	public static void main(String[] args) {
		
		String[] s = {"Tara","Dua","Emaan","Faiza","Kay","Hira"};
		
		Predicate<String> p=s1-> s1.length()>3;
		//Predicate<String> p=s1-> s1.length()%2==0;
		for(String s1 :s) {
			if (p.test(s1)) {
				
				System.out.println(s1);
		
			
		}
		
		}
 
	}

 }






package lamdaExpression;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		  int [] x = {0,5,10,15,20,25,30,35,40};
		  
		  Predicate<Integer> p1 = n ->n%2==0;
		  Predicate<Integer> p2 = n-> n>10;
		  
		  //and(), or(), negate()
		  
		  System.out.println("The numbers which are even and > 10 are :");
		  
		  for(Integer x1 :x) {
			  //if(p1.and(p2).test(x1)) {
			 // if(p1.or(p2).test(x1)) {
			  if(p1.negate().test(x1)) {
			  System.out.println(x1);
		  }
		  
		  }  

	}

}

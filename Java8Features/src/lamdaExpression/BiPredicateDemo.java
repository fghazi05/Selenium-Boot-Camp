package lamdaExpression;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		//To chck the sum of two given integers is even or not
		
		BiPredicate<Integer,Integer> p = (a,b)-> (a+b)%2 == 0;
		System.out.println(p.test(10, 20));

	}

}

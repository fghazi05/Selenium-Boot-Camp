package javaInterviewQuestions;

public class FactorialOfNum {
	
	    // find factorial of given number
	    // 1. using for loop
	
	public static void factorial(int num) {
		int fact = 1;
		
		for(int i=1; i<= num; i++) {
		 fact = fact*i;
}
		System.out.println("Factorial of " + num + " is " + fact);
		
	
	}
		//1. using recursive method
		
		public static int isfact(int n) {
			if (n==0)
			return 1;
			
			else 
				return (n* isfact(n-1));
			}
		
		
		// Main method
		public static void main(String[] args) {
//			int n = 4;
//			factorial(4);
//			System.out.println("Factorial of " + n + " using recursion is " + isfact(4));
		    int num = 4;
		    factorial(4);
		}

	}


package javaInterviewQuestions;

public class EvenOdd {
	// Find if given number is even or odd
	
	// Using bitwise checking
	public static void isEvenOrOdd(int n) {
		if((n & 1) == 0) {
			System.out.println("Using bitwise operator " + n + " is even number") ;
		}
		else {
			System.out.println("Using bitwise operator " + n + " is odd number");
		}
	}
	// Using  modulus operator
	public static void evenOrOddNumber(int num) {
		if(num %2 == 0) {
			System.out.println("Using modulus operator " + num + " is even number ");
		}
		else {
			System.out.println("Using modulus operator " + num + " is odd number");
		}
	}

	public static void main(String[] args) {
		isEvenOrOdd(-1);
		evenOrOddNumber(-1);
		
		
		
		

	}

}

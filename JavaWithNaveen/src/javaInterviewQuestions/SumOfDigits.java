package javaInterviewQuestions;

public class SumOfDigits {
	
	// Write a java program to find sum of digits in a given Integer
	
	public static void sumIs(int num) {
		
		int rem = 0;
		int sum = 0;
		
		while(num>0) {
			rem = num % 10;
			sum = sum + rem;
			num = num/10;
			
		}
		System.out.println("Sum of number is " + sum);
	}

	public static void main(String[] args) {
		sumIs(768);

	}

}

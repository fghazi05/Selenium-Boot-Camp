package javaInterviewQuestions;

public class PrimeNumbers {
	
	// Write a program to check if given number is prime or not
	public static boolean isPrimeNumber(int num) {
		
		//edge/corner case
		if( num <=1) {
			return false;
		}
		for( int i= 2; i<num; i++) {
			if (num % i == 0) {
			return false;
			
		}
	}
			return true;
		}
	// Write a program to get prime numbers from 1 t0 20 
	
	public static void getPrimeNumbers(int num) {
		for(int i = 2; i<= num; i++) {
			if(isPrimeNumber(i)) {
			System.out.print(i + " ");	
			}
		}
	}
	

	public static void main(String[] args) {
		System.out.println("2 is prime number :" + isPrimeNumber(2));
		System.out.println("3 is prime number :" + isPrimeNumber(3));
		System.out.println("17 is prime number :" + isPrimeNumber(17));
		System.out.println("-2 is prime number :" + isPrimeNumber(-2));
		System.out.println("0 is prime number :" + isPrimeNumber(0));
		System.out.println("1 is prime number :" + isPrimeNumber(1));
		
         getPrimeNumbers(20);
	}

}

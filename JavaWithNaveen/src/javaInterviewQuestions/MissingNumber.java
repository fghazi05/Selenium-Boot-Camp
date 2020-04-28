package javaInterviewQuestions;

public class MissingNumber {
	// Find missing number in an array

	public static void main(String[] args) {
		
		int a[] = {10,11,12,13,15,16,17,18};
		
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum = sum+ a[i]; // 50
		}
		System.out.println("The actual sum is " + sum);
		
		int sum1 = 0;
		for(int j = 10; j<= 18; j++ ) {
			sum1 = sum1+ j; //54
		}
		System.out.println("The expected sum is " + sum1);
		System.out.println("The missing number is " + (sum1-sum));
	}

}

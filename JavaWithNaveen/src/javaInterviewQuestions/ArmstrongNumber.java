package javaInterviewQuestions;

public class ArmstrongNumber {
	// Write a program to check if the given integer is an Armstrong Number or not
	
	public static void isArmstrongNumber(int num) {
		
		int rem = 0;
		int cube = 0; 
		int t;
		 t = num;
				 
				 while(num>0) {
					 rem = num % 10;
					 cube = cube + (rem * rem * rem );
					 num = num/10;
				 }
				 if(t== cube) {
					 System.out.println(t + " is an Armstrong Number");
				 }
				 else {
					 System.out.println(t + " is not an Armstrong Number");
				 }
	}

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(370);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(9);
		isArmstrongNumber(455);
		
		

	}

}

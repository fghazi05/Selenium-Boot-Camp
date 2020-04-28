package javaInterviewQuestions;

public class Palindrome {
	// Palindrome Number
	public static void isPalindromeNumber(int num) {
		
		int rev = 0;
		int rem = 0;
		int t;
		 t= num;
		 
		while(num>0) {
			rem = num % 10 ; //get the remainder
			rev = (rev*10) + rem;
			num = num / 10;
			
		}
		if(t==rev) {
			System.out.println( t + " is Palindrome");
		}
		else {
			System.out.println( t + " is not Palindrome");
		}
	}
	// For String
	
	public static void isPalindromeString(String s){
	
		String rev = "";
		char[] s1 = s.toCharArray();
		for(int i = s1.length-1;i>= 0; i--) {
			rev = rev + s1[i];
			
		}
		if(rev.equals(s)) {
		System.out.println(  rev + " is Palindrome ");	
		}
		else {
			System.out.println(rev + "is not Palindrome");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {

		isPalindromeNumber(151);
		isPalindromeString("teet");
	}

}

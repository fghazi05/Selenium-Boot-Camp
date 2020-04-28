package javaInterviewQuestions;
 //How to swap two Integers

public class SwappingIntegers {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		//1. Using third var
		
//		int t;
//		t = x;  
//		x= y;  // 10
//		y= t;  // 5
		
		//2. Without third var, using + operator
//		
//		x = x+y; //15
//		y = x-y; //5
//		x = x-y; //10
		
		// 3. without third var, using * operator
		
		x = x*y; //50
		y = x/y; // 5
		x = x/y; //10
		
		
		
	System.out.println(x);
	System.out.println(y);	

	}

}

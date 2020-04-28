package javaInterviewQuestions;

public class ReverseInteger {
	
	//using algo
	
	public static void getRevInteger(int num) {
		
		int rev = 0;
		int rem = 0;
		
		while(num>0) {
			rem = num % 10;
			rev = rev* 10 + rem;
			num = num/10;
		}
		System.out.println("Reverse Integer is : " + rev );
	}

	public static void main(String[] args) {
		
		getRevInteger(1234);
		
					 
        // 2. using StringBuffer
				 long num1 = 123456;
				 String str = String.valueOf(num1);
				 StringBuffer sb = new StringBuffer(str).reverse();
				 System.out.println("Reverse of 123456 is : " +sb);
		//		 System.out.println("Reverse of 123456 is : " + new StringBuffer(String.valueOf(num1)).reverse());
	}

}










;
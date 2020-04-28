package javaInterviewQuestions;
  //How to reverse a String 
  // What is the difference btw String and String Buffer
  // String is immutable object and thus no reverse method available
  // StrinBuffer is mutable and has a built in rev method available

public class ReverseString {
	 public static void main(String[] args) {
		
		 String s ="Selenium";
		 String rev = "";
		 
		 // using for loop
		char[] s1 = s.toCharArray();
		for(int i=s1.length-1; i>=0;i--) {
			rev = rev + s1[i];
			
			
		}
		System.out.print(rev);
		
		 
		 // using StringBuffer Class
		 
		// StringBuffer sb = new StringBuffer(s).reverse();
		// System.out.println(sb);
		
		String s2 = "I am learning java";
		
		String rev2 = "";
		
		String [] arr = s2.split("\\s");
		for(int i= arr.length-1; i>=0; i--) {
			
			rev2 = rev2+ arr[i] +" ";
			
		}
		System.err.println("\n");
		System.out.println(rev2);
		
		String s3 = "How are you";
		
		String [] arr2 = s3.split("\\s");
		for(String str : arr2) {
			
			 char [] ch = str.toCharArray();
			 String rev3 = "";
			 for(int j=ch.length-1;j>=0;j--) {
				  rev3 = rev3+ ch[j];
				 
			 }
			  String word= rev3.toString();
			// System.out.println("\n");
			 System.out.println(word);
		}
		
	}

}

package javaInterviewQuestions;

public class SwappingStrings {

	public static void main(String[] args) {
		 String a = "Hello";
		 String b = "World";
		 
		 System.out.println("Before Swapping");
		 System.out.println("Value of a is : " + a);
		 System.out.println("Value of b is : " + b);
		 
		 // appending the two strings
		 a= a+b ; // HelloWorld
		 
		 // storing the value of b into string a
		
		 b = a.substring(0,a.length()- b.length()); // Hello
		 
		 // storing the value of a into string b
		 
		 a = a.substring(b.length());
		 
		 System.out.println("After Swapping");
		 System.out.println("Value of a is : " + a);
		 System.out.println("Value of b is : " + b);
		 
		 
	}

}

package javaInterviewQuestions;

// How to convert String into Integer and Integer into String 

public class StringIntegerConversion {

	public static void main(String[] args) {
		 String s = "20876";
		 try {
				 int s1 = Integer.parseInt(s);
				 System.out.println(s1);

	}
		 catch(Exception e) {
			 System.out.println("Exception is caught");
		 }
		 
		 int i = 577346;
		 String i1 = Integer.toString(i);
		 System.out.println(i1);

}
}
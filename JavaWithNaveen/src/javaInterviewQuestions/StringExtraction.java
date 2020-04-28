package javaInterviewQuestions;

public class StringExtraction {

	public static void main(String[] args) {
		String str = "www.trainingrite.com";
		
		String firstFour = str.substring(0, 4);
	System.out.println(firstFour); 	
	
	    String lastFour = str.substring(str.length()-4, str.length());
	    System.out.println(lastFour);
	    
	    String middle = str.substring(4, str.length()-4);
	    System.out.println(middle);

	}

}

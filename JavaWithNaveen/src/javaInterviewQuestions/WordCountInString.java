package javaInterviewQuestions;

// write a java program to count the number of words in a String

public class WordCountInString {
	public static int countWordsInString(String s) {
		  
		if(s==null || s.isEmpty()) {
			return 0;
		}
		
		String[] words = s.trim().split("\\W+");
		System.out.println("The count is " + words.length);
		return words.length;
		
	} 
	public static void main(String[] args) {
		countWordsInString("I=love+my daughters");
	}

}

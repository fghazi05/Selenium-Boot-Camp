package javaInterviewQuestions;

// How will you remove ,junk,unwanted or special char from a particular string?


public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "^$@^&%& java  &$&^*& questions";
		// By using Regular Expression
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		

	}

}

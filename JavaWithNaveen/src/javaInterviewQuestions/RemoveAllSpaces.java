package javaInterviewQuestions;

public class RemoveAllSpaces {

	public static void main(String[] args) {
		 String s = "I = love my daughters";
		 String s1 = s.replaceAll("\\s", "");
		 System.out.println(s1);

	}

}

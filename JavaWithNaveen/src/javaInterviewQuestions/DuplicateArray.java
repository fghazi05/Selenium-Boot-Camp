package javaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	// Find duplicate element in an array

	public static void main(String[] args) {
		
		String [] s = {"Java", "Spring", "Hibernate", "Java"};
		Set<String> duplSet = new HashSet<>();
		Set<String> nonDuplSet = new HashSet<>();
		
		for(String s1:s) {
			if(!nonDuplSet.contains(s1)) {
				nonDuplSet.add(s1);
			}
			else {
				duplSet.add(s1);
			}
		}
		System.out.println("The  duplicate element is " + duplSet);

	}

}

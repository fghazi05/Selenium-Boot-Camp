package javaInterviewQuestions;

import java.util.Arrays;
//Write a java program to check whether two strings are anagrams or not

public class StringAnagram {
	
	public static void main(String[] args) {
			String str1 = "Mother in Law";
			String str2 = "Hitler woman";
		//Removing all white spaces from s1 and s2
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		
			//Changing the case of characters of both s1 and s2 and converting them to char array
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			
			//Sorting both ArrayS1 and ArrayS2
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			
			//Checking whether ArrayS1 and ArrayS2 are equal
			if( Arrays.equals(ArrayS1, ArrayS2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		}
		else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
		 
		}
	
	}



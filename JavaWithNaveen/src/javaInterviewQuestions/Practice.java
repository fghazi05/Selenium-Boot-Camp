package javaInterviewQuestions;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Practice {

	public static void main(String[] args) {
//		String str1 = "Hitler Woman";
//		String str2 = "Mother In Law";
//		
//		String s1= str1.replaceAll("\\s","");
//		String s2 =str1.replaceAll("\\s","");
//		
//		char[] char1 = s1.toLowerCase().toCharArray();
//		char[] char2 = s2.toLowerCase().toCharArray();
//		
//		Arrays.sort(char1);
//		Arrays.sort(char2);
//		
//		if(Arrays.equals(char1,char2)) {
//			System.out.println(str1 + " and " + str2 + " are Anagram");
//		}
//		else {
//			System.out.println(str1 + " and " + str2 + " are NOT Anagram");
//		}
		
		String s = "Selenium";
		
		char[] str = s.toCharArray();
		
		String rev = "";
		for(int i= str.length-1; i>= 0; i--) {
		rev = rev + str[i];
		}
		System.out.println(rev);
	}

}

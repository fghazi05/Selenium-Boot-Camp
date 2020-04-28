package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class StringCharacterCount {

	public static void main(String[] args) {
		
		String str = "laptop";
		String str1= str.replace(" ", "");
		
		 Map<Character,Integer> charcount = new HashMap<Character, Integer>();
		  char[] arr= str1.toCharArray();
		 for(int i=0;i<arr.length;++i) {
			
			if(!charcount.containsKey(arr[i])) {
				charcount.put(arr[i], 1);
			}
			else {
				charcount.put(arr[i],charcount.get(arr[i])+1);
			}
			
			}
		// for(Character c : charcount.keySet()) {
		//		System.out.println(c +"......"+ charcount.get(c));
			
		// }
		 //To print Duplicates
		 for(Character  c : charcount.keySet()) {
			 if(charcount.get(c)>1) {
			 System.out.println(c + " is duplicate character with number of occurance :" + charcount.get(c));
		 }
		 }
	}

}

package javaInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Write a java program to print all the duplicate characters from a string
public class DuplStr {

	public static void findDupStr(String str) {
		// we are using HashMap to store characters and their count
		Map<Character,Integer> dupMap = new HashMap<>();
	    
		// We first got the character array from String by calling toCharArray()
       char[] chr = str.toCharArray();
       
       //We use containsKey() method to check if key, which is a character already exists or not, 
       //if already exists we get the old count from HashMap by calling get() method and store it back after incrementing it by 1
		for(Character ch : chr) {
			if(dupMap.containsKey(ch)) {
				dupMap.put(ch, (dupMap.get(ch)+1));
			
			}
				else {
					dupMap.put(ch, 1);
					
				}
			}
			Set<Character> keys=dupMap.keySet();
			for(Character ch :keys) {
				if(dupMap.get(ch)>1) {
					System.out.println("Duplicate character " +ch + "---> " + dupMap.get(ch));
		
				}
				
		}
		
	}
	public static void main(String[] args) {
		
		findDupStr("faizaghazi");
	}
}
//Next we are using HashMap to store characters and their count. We use containsKey() method to check if key, which is a character already exists or not, if already exists we get the old count from HashMap by calling get() method and store it back after incrementing it by 1.


package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



// Write a Java Program to iterate HashMap using While and advance for loop

public class HashMapIteration {

	public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("Tara", 100);
	map.put("Sara", 200);
	map.put("Lara", 300);
	map.put("Kara", 400);
	
	System.out.println(map.size());
	System.out.println("While Loop");
	
	Iterator itr =  map.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry me = (Map.Entry) itr.next();
		System.out.println( me.getKey()+"..."+ me.getValue());
		}
	
	System.out.println("Advance For Loop");
	
	for(Map.Entry me1: map.entrySet()) {
		System.out.println( me1.getKey()+"..."+ me1.getValue());
		
	}

	}

}

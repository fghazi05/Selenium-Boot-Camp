package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {

	public static void main(String[] args) {
		 String str= "I am learning learning java java java programming";
		 
		 Map<String, Integer> map = new HashMap<String, Integer>();
		// Integer count=1;
		 String[] arr= str.split(" ");
		 for(int i=0; i<arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		 }
		 for(String x : map.keySet()) {
			 
			 System.out.println("The word count of "+x+" : "+map.get(x));
					 
		 }

	}

}

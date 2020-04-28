package collections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToListExample {
	
	public static void main(String[] args) {
		 
		String [] names = {"Sarah", "Jimmy", "Tara"};
		int [] numbers = { 1,2,3,4,5,6,7};
		
		List<String> list1 =  Arrays.asList(names);
		for(String s : list1) {
			System.out.println(s);
		}
		
		List<Integer> list2 = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		for(Integer i : list2) {
			System.out.println(i);
		}
				}
	

}

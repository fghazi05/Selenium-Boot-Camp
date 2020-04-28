package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

public class ArrayListIteration {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Tara");
		l.add("Dua");
		l.add("Emaan");
		System.out.println(l.size());
		System.out.println("While Loop");
		Iterator itr = l.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Advance Loop");
		for(String l1: l) {
			System.out.println(l1);
		}
		System.out.println("For Loop");
		for(int i =0; i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}

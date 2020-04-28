package javaInterviewQuestions;

import java.util.Arrays;

public class CommonInArrays {
	
	// Write a java program to find common elements between two arrays

	public static void main(String[] args) {
		
		//A simple solution to find common elements between two 
		//arrays in Java is to loop through one of the array in the 
		//outer loop and then traverse through the other array in an 
		//inner loop and compare the element of the outer array with all the elements of the inner array.
		
		int [] array1 = {6,7,23,1,9,44,5,8};
		int [] array2 = {1,2,7,9,44,5,8,3,22};
		
		System.out.println("Array 1 = " + Arrays.toString(array1));
		System.out.println("Array 2 = " + Arrays.toString(array2));
		System.out.println("Common elements in two arrays are :");
		
		for(int i = 0; i< array1.length; i++) {
			for(int j = 0; j< array2.length; j++) {
				if(array1[i]== array2[j]) {
					System.out.print(array1[i] + ",");
				}
			}
		}
		
		String [] s1 = {"Tara", "Dua", "Emaan", "Mariam", "Fatima","Bilal"};
		String [] s2 = {"Emaan", "Hira", "Fatima", "Rida","Bilal"};
		
		System.out.println("\n--------------");
		System.out.println("String s1 = " + Arrays.toString(s1));
		System.out.println("String s2 = " + Arrays.toString(s2));
		System.out.println("Common elements in two arrays are : ");
		 
		for(int k = 0; k< s1.length; k++) {
			for(int l =0; l<s2.length; l++) {
				if(s1[k].equals(s2[l])) {
					System.out.print(s1[k]+ ",");
				}
			}
		}
		
		

	}

}

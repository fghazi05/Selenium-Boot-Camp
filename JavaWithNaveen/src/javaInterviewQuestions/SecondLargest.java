package javaInterviewQuestions;

import java.util.Arrays;

public class SecondLargest {
	
	// Write a java program to find second largest element in array
	
	public static void isSecondLargest(int arr[]) {
		 
		int Largest = arr[0];
		int secondLargest = arr[0];
		System.out.println("The given array is:" );
		
		
		for(int i =1 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Iterate the given array
		for(int i =1 ; i<arr.length; i++) {
			
			// If current array value is greater than largest value then
            // Move the largest value to secondLargest and make current value as largest
			if(arr[i]> Largest) {
				secondLargest = Largest;
				Largest = arr[i];
			}
			
			// If the current value is smaller than largest and greater than secondLargest  then the current value becomes secondLargest
           else if(arr[i]> secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("Largest number is : " + Largest);	
	}

	public static void main(String[] args) {
		int arr[] = {4,7,89,65,34,23,57,78};
		isSecondLargest(arr);
		
		// second method
		int size = arr.length;
		Arrays.sort(arr);
		System.out.println("Array after sorting: ");
		
		for(int arr1: arr) {
			System.out.print(arr1+ " ");
		}
			int secondLargest1 = arr[size-2];
			System.out.println("\nSecond largest number is : " + secondLargest1);
		}
			

	
	}

